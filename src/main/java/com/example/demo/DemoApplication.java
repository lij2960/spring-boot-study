package com.example.demo;

import com.example.demo.filter.TestFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@SpringBootApplication
//@EnableScheduling
@EnableAsync
@ServletComponentScan
public class DemoApplication {
/*
    //入口类注册Filter
    @Bean // 讲方法中返回的对象注册到IOC容器中
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new TestFilter()); // 创建并注册TestFilter
        filterRegistrationBean.addUrlPatterns("/*"); //拦截的路径（对所有请求拦截）
        filterRegistrationBean.setName("TestFilter"); // 拦截器的名称
        filterRegistrationBean.setOrder(1); // 拦截器的执行顺序，数字越小越先执行
        return filterRegistrationBean;
    }*/

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(DemoApplication.class);
        System.setProperty("spring.devtools.restart.enabled", "false");
        sa.setAddCommandLineProperties(false);
        sa.run(args);
    }

}
