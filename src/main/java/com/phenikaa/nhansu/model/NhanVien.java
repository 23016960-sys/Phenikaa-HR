package com.phenikaa.nhansu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String maNhanVien;
    private String hoTen;
    private String truong;
    private String khoa;
    private String chucVu;
    private Double heSo;
    private String loaiNhanVien; // Hanh chinh, Hop dong
    private String email;
    private String soDienThoai;
    private Double phuCapAnTrua;
    private Double phuCapXangXe;

    // Luong co ban = 1,800,000 x He so
    public Double getLuongCoBan() {
        return heSo != null ? 1800000 * heSo : 0;
    }

    // Tong luong = Luong co ban + Phu cap
    public Double getTongLuong() {
        double luong = getLuongCoBan();
        if (phuCapAnTrua != null) luong += phuCapAnTrua;
        if (phuCapXangXe != null) luong += phuCapXangXe;
        return luong;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMaNhanVien() { return maNhanVien; }
    public void setMaNhanVien(String maNhanVien) { this.maNhanVien = maNhanVien; }
    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public String getTruong() { return truong; }
    public void setTruong(String truong) { this.truong = truong; }
    public String getKhoa() { return khoa; }
    public void setKhoa(String khoa) { this.khoa = khoa; }
    public String getChucVu() { return chucVu; }
    public void setChucVu(String chucVu) { 
        this.chucVu = chucVu;
        // Tu dong gan he so theo chuc vu
        if (chucVu != null) {
            switch (chucVu) {
                case "Truong khoa": this.heSo = 6.5; break;
                case "Pho khoa": this.heSo = 5.5; break;
                case "Giang vien chinh": this.heSo = 5.0; break;
                case "Giang vien": this.heSo = 4.0; break;
                case "Nhan vien hanh chinh": this.heSo = 2.5; break;
            }
        }
    }
    public Double getHeSo() { return heSo; }
    public void setHeSo(Double heSo) { this.heSo = heSo; }
    public String getLoaiNhanVien() { return loaiNhanVien; }
    public void setLoaiNhanVien(String loaiNhanVien) { this.loaiNhanVien = loaiNhanVien; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }
    public Double getPhuCapAnTrua() { return phuCapAnTrua != null ? phuCapAnTrua : 0; }
    public void setPhuCapAnTrua(Double phuCapAnTrua) { this.phuCapAnTrua = phuCapAnTrua; }
    public Double getPhuCapXangXe() { return phuCapXangXe != null ? phuCapXangXe : 0; }
    public void setPhuCapXangXe(Double phuCapXangXe) { this.phuCapXangXe = phuCapXangXe; }
}