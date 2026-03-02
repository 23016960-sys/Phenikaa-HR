package com.phenikaa.nhansu.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phenikaa.nhansu.model.TaiKhoan;

public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Long> {
    Optional<TaiKhoan> findByEmail(String email);
}
