package hello.login;

import hello.login.web.filter.LogFilter;
import hello.login.web.filter.LoginCheckFilter;
import jakarta.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean logFilter() {
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new LogFilter()); // 내가 만든 필터 추가
        filterFilterRegistrationBean.setOrder(1); // 순서
        filterFilterRegistrationBean.addUrlPatterns("/*"); // URL 패턴에 적용할건지

        return filterFilterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean loginCheckFilter() {
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new LoginCheckFilter()); // 내가 만든 필터 추가
        filterFilterRegistrationBean.setOrder(2); // 순서
        filterFilterRegistrationBean.addUrlPatterns("/*"); // URL 패턴에 적용할건지

        return filterFilterRegistrationBean;
    }
}
