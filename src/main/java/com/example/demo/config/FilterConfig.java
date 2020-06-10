package com.example.demo.config;

import com.example.demo.filter.TestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
   /* @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new TestFilter()); // 创建并注册TestFilter
        filterRegistrationBean.addUrlPatterns("/*"); //拦截的路径（对所有请求拦截）
        filterRegistrationBean.setName("TestFilter"); // 拦截器的名称
        filterRegistrationBean.setOrder(1); // 拦截器的执行顺序，数字越小越先执行
        return filterRegistrationBean;
    }*/
}
