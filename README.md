# 🎓 Phenikaa HR - Nhóm 2

## 👥 Thành viên nhóm
- Nguyễn Văn Bắc
- (Thêm thành viên nếu có)

---

## 📌 Mô tả dự án

**Phenikaa HR** là hệ thống quản lý nhân sự dành cho Đại học Phenikaa, được xây dựng bằng **Java Spring Boot**.

Ứng dụng hỗ trợ quản lý toàn diện về nhân viên, tài khoản đăng nhập, phân loại theo trường – khoa – chức vụ và tính lương tự động.

---

# 🚀 Chức năng chính

## 👨‍💼 Quản lý nhân viên (Employee Management)

- Thêm, sửa, xóa, hiển thị danh sách nhân viên
- Quản lý thông tin: mã nhân viên, họ tên, trường, khoa, chức vụ
- Tự động gán hệ số theo chức vụ
- Phân loại nhân viên: Hành chính / Hợp đồng

---

## 🔐 Quản lý tài khoản (Account Management)

- Đăng ký tài khoản
- Đăng nhập hệ thống
- Mã hóa mật khẩu bằng BCrypt
- Xác thực người dùng bằng Spring Security

---

## 💰 Tính lương (Salary Management)

- Lương cơ bản = 1.800.000 × hệ số
- Cộng phụ cấp ăn trưa
- Cộng phụ cấp xăng xe
- Hiển thị tổng lương
- Thống kê tổng quỹ lương

---

## 📊 Báo cáo & Thống kê

- Tổng số nhân viên
- Tổng quỹ lương
- Lương trung bình

---

# 🏗 Kiến trúc hệ thống

Ứng dụng được xây dựng theo mô hình:

> **MVC (Model – View – Controller)**

- Controller: Xử lý request
- Service: Xử lý nghiệp vụ
- Repository: Truy cập dữ liệu
- Model: Đại diện thực thể

---

# 🧱 Các lớp Model chính

## 🔹 NhanVien

**Thuộc tính:**

- id  
- maNhanVien  
- hoTen  
- truong  
- khoa  
- chucVu  
- heSo  
- loaiNhanVien  
- email  
- soDienThoai  
- phuCapAnTrua  
- phuCapXangXe  

---

## 🔹 TaiKhoan

**Thuộc tính:**

- id  
- email  
- matKhau  

---

# 📂 Cấu trúc dự án

```bash
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
⚙ Công nghệ sử dụng

Java 17

Spring Boot 3.1.4

Spring Security

Spring Data JPA

Thymeleaf

Bootstrap 5

H2 Database

Maven

▶ Hướng dẫn chạy dự án
📌 Yêu cầu hệ thống

Java 17+

Maven 3.6+

🚀 Cài đặt và chạy

Clone repository:

git clone <link-repository-của-bạn>
cd phenikaa-hr

Build và chạy:

mvn clean install
mvn spring-boot:run

Truy cập:

http://localhost:8080/
🖼 Hình ảnh & Sơ đồ
1️⃣ Class Diagram

2️⃣ Activity Diagram

3️⃣ Lưu đồ thuật toán

📌 Kết luận

Phenikaa HR là hệ thống quản lý nhân sự hoàn chỉnh, áp dụng kiến thức về OOP, Spring Boot và bảo mật vào bài toán thực tế.


---

### 🔥 Lưu ý quan trọng

- Phải có `#` trước tiêu đề
- Phải có `-` trước bullet
- Phải có ```bash nếu muốn hiển thị code block
- Ảnh nên đặt trong thư mục `images/`

---

Nếu bạn muốn mình làm luôn bản README nhìn như project 100⭐ trên GitHub (badge, logo, banner gradient, status build…), mình làm cho bạn bản pro luôn 😎
ok

Ok 😎 mình nâng cấp cho bạn bản README chuẩn GitHub chuyên nghiệp (kiểu project 100⭐) luôn.

Bạn chỉ cần copy toàn bộ code dưới đây → paste vào README.md → commit là đẹp ngay.

<p align="center">
  <h1 align="center">🎓 Phenikaa HR</h1>
  <p align="center">
    Hệ thống Quản lý Nhân sự Đại học Phenikaa<br>
    <b>Spring Boot • Java 17 • Spring Security • JPA</b>
  </p>
</p>

---

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.1.4-brightgreen?style=for-the-badge&logo=springboot">
  <img src="https://img.shields.io/badge/Database-H2-blue?style=for-the-badge&logo=h2">
  <img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven">
</p>

---

# 👥 Thành viên nhóm

- Nguyễn Văn Bắc  
- (Thêm thành viên nếu có)

---

# 📌 Giới thiệu

**Phenikaa HR** là hệ thống quản lý nhân sự dành cho Đại học Phenikaa.  
Ứng dụng được xây dựng bằng **Spring Boot** theo mô hình **MVC**, hỗ trợ:

- Quản lý nhân viên (CRUD)
- Đăng nhập & phân quyền
- Tính lương tự động
- Thống kê & báo cáo

---

# 🚀 Chức năng chính

## 👨‍💼 Quản lý nhân viên
- Thêm / Sửa / Xóa / Xem danh sách
- Phân loại theo trường – khoa – chức vụ
- Tự động gán hệ số theo chức vụ

## 🔐 Quản lý tài khoản
- Đăng ký
- Đăng nhập
- Mã hóa mật khẩu bằng BCrypt
- Bảo mật bằng Spring Security

## 💰 Tính lương

Lương cơ bản = 1.800.000 × hệ số
Tổng lương = Lương cơ bản + Phụ cấp ăn trưa + Phụ cấp xăng xe


## 📊 Báo cáo
- Tổng số nhân viên
- Tổng quỹ lương
- Lương trung bình

---

# 🏗 Kiến trúc hệ thống


Controller → Service → Repository → Database
↓
Model


Ứng dụng xây dựng theo mô hình:

> **MVC (Model – View – Controller)**

---

# 🧱 Mô hình dữ liệu

## 🔹 Entity: NhanVien

| Trường | Kiểu |
|--------|------|
| id | Long |
| maNhanVien | String |
| hoTen | String |
| truong | String |
| khoa | String |
| chucVu | String |
| heSo | Double |
| loaiNhanVien | String |
| email | String |
| soDienThoai | String |
| phuCapAnTrua | Double |
| phuCapXangXe | Double |

---

## 🔹 Entity: TaiKhoan

| Trường | Kiểu |
|--------|------|
| id | Long |
| email | String |
| matKhau | String (BCrypt) |

---

# 📂 Cấu trúc dự án

```bash
phenikaa-hr/
├── controller/
├── model/
├── repository/
├── security/
├── service/
└── resources/
⚙ Công nghệ sử dụng

Java 17

Spring Boot 3.1.4

Spring Security

Spring Data JPA

Thymeleaf

Bootstrap 5

H2 Database

Maven

▶ Hướng dẫn chạy
📌 Yêu cầu

Java 17+

Maven 3.6+

🚀 Cài đặt
git clone <link-repository>
cd phenikaa-hr
mvn clean install
mvn spring-boot:run

Truy cập:

http://localhost:8080/
🖼 UML Diagrams
1️⃣ Class Diagram

2️⃣ Activity Diagram

3️⃣ Flowchart

🌟 Điểm nổi bật

✔ Kiến trúc phân tầng rõ ràng

✔ Bảo mật chuẩn Spring Security

✔ Tính lương tự động

✔ Dễ mở rộng sang MySQL/PostgreSQL

✔ Giao diện thân thiện, responsive

📌 Kết luận

Phenikaa HR là hệ thống quản lý nhân sự hoàn chỉnh, áp dụng kiến thức về:

OOP

MVC Architecture

Spring Security

Database Integration

Phù hợp triển khai thực tế trong môi trường đại học.


---
