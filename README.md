 Phenikaa HR -- Hệ thống Quản lý Nhân sự Đại học Phenikaa
Thành viên nhóm

-   Backend Developer
-   Nguyễn Văn Bắc 23016960
-   Frontend Developer
-   Phạm Tuấn Đạt 23010889


------------------------------------------------------------------------

** Giới thiệu dự án

**Phenikaa HR** là hệ thống quản lý nhân sự được xây dựng bằng Spring
Boot 3.1.4 và Java 17.\
Hệ thống hỗ trợ quản lý nhân viên, tính lương tự động và đảm bảo bảo mật
bằng Spring Security.

------------------------------------------------------------------------
**Chức năng hệ thống

  STT   Chức năng             Mô tả
  ----- --------------------- -----------------------------------------
  1     Đăng nhập             Xác thực người dùng bằng email/mật khẩu
  2     Danh sách nhân viên   Hiển thị tất cả nhân viên
  3     Thêm nhân viên        Nhập thông tin nhân viên mới
  4     Sửa nhân viên         Cập nhật thông tin
  5     Xóa nhân viên         Xóa khỏi hệ thống
  6     Xem chi tiết          Hiển thị đầy đủ thông tin và lương
  7     Tính lương            Thống kê và chi tiết lương

------------------------------------------------------------------------

** Kiến trúc hệ thống

Hệ thống được xây dựng theo mô hình **MVC (Model -- View --
Controller)**.

-   Backend: Spring Boot\
-   Database: H2\
-   Frontend: Thymeleaf + Bootstrap\
-   Security: Spring Security

------------------------------------------------------------------------

** Cấu trúc dự án

``` plaintext
phenikaa-hr/
├── pom.xml
├── src/main/java/com/phenikaa/nhansu/
│   ├── controller/
│   ├── model/
│   ├── repository/
│   ├── security/
│   └── service/
└── src/main/resources/
    ├── templates/
    └── static/
```

------------------------------------------------------------------------

 Biểu đồ hệ thống
 Cấu trúc dự án

![Cấu trúc dự án](chart_structure.png)

------------------------------------------------------------------------

2 Chức năng hệ thống

![Chức năng hệ thống](chart_functions.png)

------------------------------------------------------------------------

Mô hình dữ liệu (Entity UML)

![Entity UML](chart_entity.png)

------------------------------------------------------------------------

Mô hình dữ liệu

Entity: NhanVien

-   id : Long (PK)\
-   maNhanVien : String\
-   hoTen : String\
-   truong : String\
-   khoa : String\
-   chucVu : String\
-   heSo : Double\
-   loaiNhanVien : String\
-   email : String\
-   soDienThoai : String\
-   phuCapAnTrua : Double\
-   phuCapXangXe : Double

Entity: TaiKhoan

-   id : Long (PK)\
-   email : String\
-   matKhau : String (BCrypt)

------------------------------------------------------------------------

Hướng dẫn chạy

``` bash
mvn clean compile
mvn spring-boot:run
```

Truy cập: http://localhost:8080

------------------------------------------------------------------------
 Kết luận
 Dự án thể hiện khả năng áp dụng Spring Boot, JPA và Spring Security\
vào bài toán quản lý nhân sự thực tế trong môi trường đại học.
