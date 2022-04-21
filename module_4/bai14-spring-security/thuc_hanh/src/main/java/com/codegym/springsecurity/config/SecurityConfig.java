package com.codegym.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //Phương thức Override configure(AuthenticationManagerBuilder auth) cấu hình xác thực bộ nhớ với thông tin đăng nhập và vai trò của người dùng.
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}12345").roles("USER")
                .and()
                .withUser("admin").password("{noop}12345").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll()
                .and()
                .authorizeRequests().antMatchers("/user**").hasRole("USER")
                .and()
                .authorizeRequests().antMatchers("/admin**").hasRole("ADMIN")
                .and()
                .formLogin()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
    }
    //Phương thức Override configure(HttpSecurity http) cấu hình bảo mật dựa trên web cho tất cả các yêu cầu HTTP.
    // Theo mặc định, nó sẽ được áp dụng cho tất cả các yêu cầu, nhưng có thể bị hạn chế bằng cách sử dụng requestMatcher() hoặc các phương thức tương tự khác.
//    Url '/' không được bảo mật và có thể được truy cập bởi bất kỳ ai.
//    Bất kỳ URL nào bắt đầu bằng '/user' đều được bảo mật và chỉ những người dùng nào có vai trò 'USER' mới có thể truy cập được.
//    Bất kỳ URL nào bắt đầu bằng '/admin' đều được bảo mật và chỉ những người dùng nào có vai trò 'ADMIN' mới có thể truy cập được
}
