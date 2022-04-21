package com.codegym.casestudy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Qualifier("userService")
    @Autowired
    private UserDetailsService userDetailsService; // có sẵn của spring, có sẵn các phương thức getUsername,.....
    @Autowired
    AppConfig appConfig;


    //    AppConfig appConfig = new AppConfig();
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { // chức nănglogin hiện thị thông tin trên menu, để các trang có thể lấy được thông tin
        auth.userDetailsService(userDetailsService).passwordEncoder(appConfig.passwordEncoder());
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                //Cấu hình cho các đuòng dẫn không cần xác thực
                .antMatchers("/login").permitAll()
                //Cấu hình cho các đường dẫn đăng nhập bằng Role là Member, Admin
                .antMatchers("/**").hasAnyRole("MEMBER", "ADMIN")
                //cấu hình cho đường dẫn admin, chỉ có Role admin mới vào được
                .antMatchers("/admin/**").hasRole("ADMIN")
                .and()
                //formlogin
                .formLogin()
                //Đường dẫn trả về trang authentication
                .loginPage("/login")
                .usernameParameter("userName")
                .passwordParameter("passWord")
                //Nếu authentication thành công
                .defaultSuccessUrl("/user")
                //Nếu authentication thất bại
                .failureUrl("/login?error")
                //Nếu authentication thành công nhưng vào trang không đúng role
                .and()
                // nghĩa là nếu bạn không phải admin, mà cố tình vào thì nó sẽ thông báo lỗi 403
                .exceptionHandling()
                .accessDeniedPage("/403")
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/").permitAll()
                .invalidateHttpSession(true)
                // xóa JSESSIONID và k luuw lại
                .deleteCookies("JSESSIONID")
        ;
        // rememberMe : lưu cookie dưới client thời gian 24h
        http.authorizeRequests().and() //
                .rememberMe().tokenRepository(this.persistentTokenRepository()) //
                .tokenValiditySeconds(1 * 24 * 60 * 60); // 24h
    }

    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        InMemoryTokenRepositoryImpl memory = new InMemoryTokenRepositoryImpl(); // được lưu ở memory tức là thanh ram của service
        return memory;
    }
}
