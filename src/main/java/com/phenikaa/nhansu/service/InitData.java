package com.phenikaa.nhansu.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.phenikaa.nhansu.model.NhanVien;
import com.phenikaa.nhansu.model.TaiKhoan;
import com.phenikaa.nhansu.repository.NhanVienRepository;
import com.phenikaa.nhansu.repository.TaiKhoanRepository;

@Component
public class InitData implements CommandLineRunner {
    private final NhanVienRepository nhanVienRepo;
    private final TaiKhoanRepository taiKhoanRepo;
    private final PasswordEncoder encoder;

    public InitData(NhanVienRepository nhanVienRepo, TaiKhoanRepository taiKhoanRepo, PasswordEncoder encoder) {
        this.nhanVienRepo = nhanVienRepo;
        this.taiKhoanRepo = taiKhoanRepo;
        this.encoder = encoder;
    }

    @Override
    public void run(String... args) {
        // Tao tai khoan admin
        if (taiKhoanRepo.count() == 0) {
            TaiKhoan tk = new TaiKhoan();
            tk.setEmail("admin@phenikaa.edu.vn");
            tk.setMatKhau(encoder.encode("123456"));
            taiKhoanRepo.save(tk);
        }

        if (nhanVienRepo.count() == 0) {
            // TRUONG CONG NGHE THONG TIN
            tao("NV001", "GS.TS Nguyen Van An", "Truong CNTT", "Khoa Khoa hoc may tinh", "Truong Khoa", 6.5, "Hanh chinh", "an@phenikaa.edu.vn", "0901111111", 800000.0, 500000.0);
            tao("NV002", "PGS.TS Tran Thi Binh", "Truong CNTT", "Khoa Ky thuat phan mem", "Pho Khoa", 5.5, "Hanh chinh", "binh@phenikaa.edu.vn", "0901111112", 700000.0, 400000.0);
            tao("NV003", "TS. Le Van Cuong", "Truong CNTT", "Khoa He thong thong tin", "Giang vien chinh", 5.0, "Hanh chinh", "cuong@phenikaa.edu.vn", "0901111113", 600000.0, 300000.0);
            tao("NV004", "ThS. Pham Thi Dung", "Truong CNTT", "Khoa Khoa hoc may tinh", "Giang vien", 4.0, "Hop dong", "dung@phenikaa.edu.vn", "0901111114", 500000.0, 300000.0);

            // TRUONG KY THUAT
            tao("NV005", "GS.TS Hoang Van Em", "Truong Ky thuat", "Khoa Co khi", "Truong Khoa", 6.5, "Hanh chinh", "em@phenikaa.edu.vn", "0902222221", 800000.0, 500000.0);
            tao("NV006", "PGS.TS Vu Thi Phuong", "Truong Ky thuat", "Khoa Dien - Dien tu", "Pho Khoa", 5.5, "Hanh chinh", "phuong@phenikaa.edu.vn", "0902222222", 700000.0, 400000.0);
            tao("NV007", "TS. Nguyen Van Giang", "Truong Ky thuat", "Khoa Xay dung", "Giang vien chinh", 5.0, "Hop dong", "giang@phenikaa.edu.vn", "0902222223", 600000.0, 300000.0);
            tao("NV008", "ThS. Tran Van Hung", "Truong Ky thuat", "Khoa Co khi", "Giang vien", 4.0, "Hop dong", "hung@phenikaa.edu.vn", "0902222224", 500000.0, 300000.0);

            // TRUONG KINH TE
            tao("NV009", "PGS.TS Le Thi Lan", "Truong Kinh te", "Khoa Quan tri kinh doanh", "Truong Khoa", 6.5, "Hanh chinh", "lan@phenikaa.edu.vn", "0903333331", 800000.0, 500000.0);
            tao("NV010", "TS. Pham Van Khanh", "Truong Kinh te", "Khoa Tai chinh - Ngan hang", "Pho Khoa", 5.5, "Hanh chinh", "khanh@phenikaa.edu.vn", "0903333332", 700000.0, 400000.0);
            tao("NV011", "ThS. Nguyen Thi Linh", "Truong Kinh te", "Khoa Ke toan", "Giang vien", 4.0, "Hanh chinh", "linh@phenikaa.edu.vn", "0903333333", 500000.0, 300000.0);
            tao("NV012", "CN. Tran Van Minh", "Truong Kinh te", "Khoa Quan tri kinh doanh", "Nhan vien hanh chinh", 2.5, "Hop dong", "minh@phenikaa.edu.vn", "0903333334", 400000.0, 200000.0);

            // TRUONG Y - DUOC
            tao("NV013", "GS.TS Vu Thi Nga", "Truong Y - Duoc", "Khoa Y", "Truong Khoa", 6.5, "Hanh chinh", "nga@phenikaa.edu.vn", "0904444441", 800000.0, 500000.0);
            tao("NV014", "PGS.TS Le Van Oanh", "Truong Y - Duoc", "Khoa Duoc", "Pho Khoa", 5.5, "Hanh chinh", "oanh@phenikaa.edu.vn", "0904444442", 700000.0, 400000.0);
            tao("NV015", "TS. Pham Thi Phu", "Truong Y - Duoc", "Khoa Dieu duong", "Giang vien chinh", 5.0, "Hanh chinh", "phu@phenikaa.edu.vn", "0904444443", 600000.0, 300000.0);
            tao("NV016", "BS. Nguyen Van Quang", "Truong Y - Duoc", "Khoa Y", "Giang vien", 4.0, "Hop dong", "quang@phenikaa.edu.vn", "0904444444", 500000.0, 300000.0);

            // TRUONG NGOAI NGU - KHXH
            tao("NV017", "PGS.TS Tran Thi Roi", "Truong Ngoai ngu - KHXH", "Khoa Tieng Anh", "Truong Khoa", 6.5, "Hanh chinh", "roi@phenikaa.edu.vn", "0905555551", 800000.0, 500000.0);
            tao("NV018", "TS. Le Van Son", "Truong Ngoai ngu - KHXH", "Khoa Truyen thong", "Pho Khoa", 5.5, "Hanh chinh", "son@phenikaa.edu.vn", "0905555552", 700000.0, 400000.0);
            tao("NV019", "ThS. Vu Thi Tam", "Truong Ngoai ngu - KHXH", "Khoa Du lich", "Giang vien", 4.0, "Hop dong", "tam@phenikaa.edu.vn", "0905555553", 500000.0, 300000.0);
            tao("NV020", "CN. Nguyen Van Uyen", "Truong Ngoai ngu - KHXH", "Khoa Tieng Anh", "Nhan vien hanh chinh", 2.5, "Hop dong", "uyen@phenikaa.edu.vn", "0905555554", 400000.0, 200000.0);
        }
    }

    private void tao(String ma, String hoTen, String truong, String khoa, String chucVu, Double heSo, 
                     String loaiNV, String email, String sdt, Double phuCapAn, Double phuCapXe) {
        NhanVien nv = new NhanVien();
        nv.setMaNhanVien(ma);
        nv.setHoTen(hoTen);
        nv.setTruong(truong);
        nv.setKhoa(khoa);
        nv.setChucVu(chucVu);
        nv.setHeSo(heSo);
        nv.setLoaiNhanVien(loaiNV);
        nv.setEmail(email);
        nv.setSoDienThoai(sdt);
        nv.setPhuCapAnTrua(phuCapAn);
        nv.setPhuCapXangXe(phuCapXe);
        nhanVienRepo.save(nv);
    }
}