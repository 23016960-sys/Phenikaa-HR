package com.phenikaa.nhansu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phenikaa.nhansu.model.NhanVien;
import com.phenikaa.nhansu.repository.NhanVienRepository;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {
    private final NhanVienRepository repo;

    public NhanVienController(NhanVienRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public String danhSach(Model m) {
        m.addAttribute("danhSachNhanVien", repo.findAll());
        return "danh_sach_nhanvien";
    }

    @GetMapping("/them")
    public String themForm(Model m) {
        m.addAttribute("nhanVien", new NhanVien());
        return "them_nhanvien";
    }

    @PostMapping("/them")
    public String them(@ModelAttribute NhanVien nhanVien) {
        repo.save(nhanVien);
        return "redirect:/nhanvien";
    }

    @GetMapping("/sua/{id}")
    public String suaForm(@PathVariable Long id, Model m) {
        var nv = repo.findById(id);
        if (nv.isEmpty()) return "redirect:/nhanvien";
        m.addAttribute("nhanVien", nv.get());
        return "sua_nhanvien";
    }

    @PostMapping("/sua/{id}")
    public String sua(@PathVariable Long id, @ModelAttribute NhanVien nhanVien) {
        var opt = repo.findById(id);
        if (opt.isPresent()) {
            NhanVien nv = opt.get();
            nv.setMaNhanVien(nhanVien.getMaNhanVien());
            nv.setHoTen(nhanVien.getHoTen());
            nv.setTruong(nhanVien.getTruong());
            nv.setKhoa(nhanVien.getKhoa());
            nv.setChucVu(nhanVien.getChucVu());
            nv.setHeSo(nhanVien.getHeSo());
            nv.setLoaiNhanVien(nhanVien.getLoaiNhanVien());
            nv.setEmail(nhanVien.getEmail());
            nv.setSoDienThoai(nhanVien.getSoDienThoai());
            nv.setPhuCapAnTrua(nhanVien.getPhuCapAnTrua());
            nv.setPhuCapXangXe(nhanVien.getPhuCapXangXe());
            repo.save(nv);
        }
        return "redirect:/nhanvien";
    }

    @GetMapping("/xoa/{id}")
    public String xoa(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/nhanvien";
    }

    @GetMapping("/xem/{id}")
    public String xem(@PathVariable Long id, Model m) {
        var nv = repo.findById(id);
        if (nv.isEmpty()) return "redirect:/nhanvien";
        m.addAttribute("nhanVien", nv.get());
        return "xem_nhanvien";
    }

    @GetMapping("/luong")
    public String danhSachLuong(Model m) {
        var list = repo.findAll();
        m.addAttribute("danhSachNhanVien", list);
        double tongLuong = list.stream().mapToDouble(NhanVien::getTongLuong).sum();
        m.addAttribute("tongLuong", tongLuong);
        return "tinh_luong";
    }

    @GetMapping("/luong/{id}")
    public String chiTietLuong(@PathVariable Long id, Model m) {
        var nv = repo.findById(id);
        if (nv.isEmpty()) return "redirect:/nhanvien/luong";
        m.addAttribute("nhanVien", nv.get());
        return "chi_tiet_luong";
    }
}
