package com.phenikaa.nhansu.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.phenikaa.nhansu.repository.TaiKhoanRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final TaiKhoanRepository repo;

    public UserDetailsServiceImpl(TaiKhoanRepository repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        var tk = repo.findByEmail(email)
            .orElseThrow(() -> new UsernameNotFoundException("Khong tim thay: " + email));
        return User.builder()
            .username(tk.getEmail())
            .password(tk.getMatKhau())
            .roles("USER")
            .build();
    }
}
