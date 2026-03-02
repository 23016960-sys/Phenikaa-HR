package com.phenikaa.nhansu.repository;

import com.phenikaa.nhansu.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {
    Optional<NhanVien> findByMaNhanVien(String maNhanVien);
}