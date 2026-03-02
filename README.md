<p align="center">
  <h1 align="center"> Phenikaa HR</h1>
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

#  Thành viên nhóm

- Nguyễn Văn Bắc
- 23016960
- Phạm Tuấn Đạt
- 23010889

---

#  Giới thiệu

**Phenikaa HR** là hệ thống quản lý nhân sự dành cho Đại học Phenikaa.  
Ứng dụng được xây dựng bằng **Spring Boot** theo mô hình **MVC**, hỗ trợ:

- Quản lý nhân viên (CRUD)
- Đăng nhập & phân quyền
- Tính lương tự động
- Thống kê & báo cáo

---

#  Chức năng chính

##  Quản lý nhân viên
- Thêm / Sửa / Xóa / Xem danh sách
- Phân loại theo trường – khoa – chức vụ
- Tự động gán hệ số theo chức vụ

##  Quản lý tài khoản
- Đăng ký
- Đăng nhập
- Mã hóa mật khẩu bằng BCrypt
- Bảo mật bằng Spring Security

##  Tính lương

```bash
Lương cơ bản = 1.800.000 × hệ số
Tổng lương = Lương cơ bản + Phụ cấp ăn trưa + Phụ cấp xăng xe
```

##  Báo cáo
- Tổng số nhân viên
- Tổng quỹ lương
- Lương trung bình

---

#  Kiến trúc hệ thống

```bash
Controller → Service → Repository → Database
                ↓
              Model
```

Ứng dụng xây dựng theo mô hình:

> **MVC (Model – View – Controller)**

---

#  Mô hình dữ liệu

##  Entity: NhanVien

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

##  Entity: TaiKhoan

| Trường | Kiểu |
|--------|------|
| id | Long |
| email | String |
| matKhau | String (BCrypt) |

---

#  Cấu trúc dự án

```bash
  Phenikaa-HR/
├─ .gitignore
├─ Dockerfile
├─ README.md
├─ pom.xml
├─ render.yaml
├───src
├───main
│         ├───java
│         │   └───com
│         │       └───phenikaa
│         │           └───nhansu
│         │               ├───controller
│         │               ├───model
│         │               ├───repository
│         │               ├───security
│         │               └───service
│         └───resources
│             ├───static
│             │           └───images
│             └───templates
└───test
            └───java

```

---

#  Công nghệ sử dụng

- Java 17
- Spring Boot 3.1.4
- Spring Security
- Spring Data JPA
- Thymeleaf
- Bootstrap 5
- H2 Database
- Maven

---

#  Hướng dẫn chạy

##  Yêu cầu
- Java 17+
- Maven 3.6+

##  Cài đặt

```bash
git clone <link-repository>
cd phenikaa-hr
mvn clean install
mvn spring-boot:run
```

Truy cập:

```
http://localhost:8080/
```

---
Hoặc nhấn trực tiếp vào đường link: https://phenikaa-hr.onrender.com/

#  UML Diagrams

## 1️ Class Diagram
<img width="662" height="549" alt="Screenshot 2026-03-02 115713" src="https://github.com/user-attachments/assets/e8fe8429-0abb-4ca6-99b8-0abb3937773a" />

## 2️ Activity Diagram
<img width="1919" height="3294" alt="Activity_Diagram_Final_Oval_End" src="https://github.com/user-attachments/assets/3336fce7-6738-4649-8c12-92e44b7988b3" />


## 3️ Flowchart

<img width="1919" height="3294" alt="Flowchart_Final_OvalStyle" src="https://github.com/user-attachments/assets/aef38b86-c51a-49c6-a248-3602d420dfd2" />

---

#  Điểm nổi bật

-  Kiến trúc phân tầng rõ ràng
-  Bảo mật chuẩn Spring Security
-  Tính lương tự động
-  Dễ mở rộng sang MySQL/PostgreSQL
-  Giao diện thân thiện, responsive
---

#  Kết luận

Phenikaa HR là hệ thống quản lý nhân sự hoàn chỉnh, áp dụng kiến thức về:

- OOP
- MVC Architecture
- Spring Security
- Database Integration

Phù hợp triển khai thực tế trong môi trường đại học.
