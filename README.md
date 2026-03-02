Phenikaa HR - Nhóm 2
Thành viên nhóm

Nguyễn Văn Bắc
23016960
Phạm Tuấn Đạt
23010889
Mô tả dự án

Phenikaa HR là hệ thống quản lý nhân sự dành cho Đại học Phenikaa, được xây dựng bằng Java Spring Boot.

Ứng dụng hỗ trợ quản lý toàn diện về nhân viên, tài khoản đăng nhập, phân loại theo trường – khoa – chức vụ và tính lương tự động.

Chức năng chính
Quản lý nhân viên (Employee Management)

Thêm, sửa, xóa, hiển thị danh sách nhân viên

Quản lý thông tin: mã nhân viên, họ tên, trường, khoa, chức vụ

Tự động gán hệ số theo chức vụ

Phân loại nhân viên: Hành chính / Hợp đồng

Quản lý tài khoản (Account Management)

Đăng ký tài khoản

Đăng nhập hệ thống

Mã hóa mật khẩu bằng BCrypt

Xác thực người dùng bằng Spring Security

Tính lương (Salary Management)

Tính lương cơ bản = 1.800.000 × hệ số

Cộng phụ cấp ăn trưa

Cộng phụ cấp xăng xe

Hiển thị tổng lương

Thống kê tổng quỹ lương

Báo cáo & Thống kê

Tổng số nhân viên

Tổng quỹ lương

Lương trung bình

Kiến trúc và Mô hình dữ liệu
Kiến trúc hệ thống

Ứng dụng được xây dựng theo mô hình MVC (Model – View – Controller):

Controller: Xử lý request từ người dùng

Service: Xử lý nghiệp vụ

Repository: Truy cập dữ liệu

Model: Đại diện thực thể dữ liệu

Các lớp Model chính
NhanVien

Thuộc tính:

id

maNhanVien

hoTen

truong

khoa

chucVu

heSo

loaiNhanVien

email

soDienThoai

phuCapAnTrua

phuCapXangXe

Phương thức:

getter/setter

toString()

TaiKhoan

Thuộc tính:

id

email

matKhau

Phương thức:

getter/setter

Repository Layer

NhanVienRepository

TaiKhoanRepository

Sử dụng Spring Data JPA để thao tác với database.

Service Layer

NhanVienService

UserDetailsServiceImpl

InitData

Controller Layer

NhanVienController

AuthController

Security Layer

SecurityConfig

UserDetailsServiceImpl

Công nghệ sử dụng

Java 17

Spring Boot 3.1.4

Spring Security

Spring Data JPA

Thymeleaf

Bootstrap 5

H2 Database

Maven

Cấu trúc dự án
phenikaa-hr/
├── src/main/java/com/phenikaa/nhansu/
│   ├── controller/
│   ├── model/
│   ├── repository/
│   ├── security/
│   └── service/
└── src/main/resources/
    ├── templates/
    └── static/
Hướng dẫn chạy dự án
Yêu cầu hệ thống

Java 17 hoặc cao hơn

Maven 3.6+

Cài đặt và chạy

Clone repository:

git clone <link-repository-của-bạn>
cd phenikaa-hr

Build và chạy:

mvn clean install
mvn spring-boot:run

Truy cập:

http://localhost:8080/
Tính năng nổi bật
1. Kiến trúc chuẩn Spring Boot

Phân tầng rõ ràng

Dễ mở rộng

Bảo mật với Spring Security

2. Tính lương tự động

Tự động tính theo hệ số

Hỗ trợ phụ cấp

Không cần tính tay

3. Giao diện Web thân thiện

Sử dụng Thymeleaf

Responsive với Bootstrap

Form validation

Hình ảnh & Sơ đồ
1. Class Diagram

(Class Diagram – thêm ảnh vào đây)

2. Activity Diagram

(Activity Diagram – thêm ảnh vào đây)

3. Lưu đồ thuật toán

(Lưu đồ thuật toán – thêm ảnh vào đây)

Kết luận

Phenikaa HR là hệ thống quản lý nhân sự hoàn chỉnh, áp dụng kiến thức về OOP, Spring Boot và bảo mật vào bài toán thực tế trong môi trường đại học.--------------------------
 Kết luận
 Dự án thể hiện khả năng áp dụng Spring Boot, JPA và Spring Security\
vào bài toán quản lý nhân sự thực tế trong môi trường đại học.
