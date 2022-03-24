package com.codegym.managercustomer.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;
@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
    //Khai báo cấu hình bean messageSource, ở đây là mã mẫu khi khai báo bằng annotation trong file cấu hình bằng java.
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("message");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
    /*Trong đó, giá trị "message" chính là tên file trong file message.properties.
    Nhớ thêm các imports cần thiết.
    Sau đó, ở templates, gọi tới tên của các message trong file message.properties thay vì sử dụng hard-coded,
    sau đây là mã tham khảo khi templates là html và được resolve bằng thư viện thymeleaf, chú ý cú pháp #{messagePath} trong file login.html:*/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("lang");
        registry.addInterceptor(interceptor);
    }
    //Interceptor này sẽ tự động phân tích tham số lang đi kèm các request để xác định bản địa hiện tại.

    //Tiếp theo, bổ sung bean localeResolver để sử dụng thông tin về bản địa và sử dụng message bundle tương ứng:
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("en"));
        return localeResolver;
    }
    //Ở đây, ta đã khai báo một localeResolver lấy thông tin về bản địa từ session của người dùng, đồng thời dự phòng sử dụng ngôn ngữ là “en”.
}
