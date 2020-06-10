package com.example.demo.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfiguration {
    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings("/druid/*");
        Map<String, String> initParameters = new HashMap<String, String>();
        initParameters.put("loginUsername", "admin");
        initParameters.put("loginPassword", "admin");
        initParameters.put("resetEnable", "false"); // 禁用HTML页面上的"Reset All"功能
        initParameters.put("allow", ""); // IP白名单（没有配置或者为空，则允许所有访问）
//        initParameters.put("deny", "192.168.20.38"); // ip 黑名单 （共存时，deny优先于allow）
        servletRegistrationBean.setInitParameters(initParameters);
        return servletRegistrationBean;
    }

//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new WebStatFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        // 忽略资源
//        filterRegistrationBean.addInitParameter("exclusions", "*.js, *.gif, *.jpg, *.bmp, *.png, *.css, *.ico, /druid/*");
//        return filterRegistrationBean;
//    }
}
