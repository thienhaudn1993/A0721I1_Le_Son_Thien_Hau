package com.codegym.casestudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {
    public AppConfig() {
    }

    @Bean
    public PasswordEncoder passwordEncoder() { // nghĩa là mã hóa mật khẩu mới được lưu ( đạo đức nghề nghiệp ), vì có thể nhiều tk dùng chung 1 password nên cần mã hóa để tránh lộ tất cả mk
        return new BCryptPasswordEncoder();
    }
}
