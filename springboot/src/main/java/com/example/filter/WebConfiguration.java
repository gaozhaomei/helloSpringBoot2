package com.example.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
    @Autowired
    private MyFilter myFilter;
    @Autowired
    private MyFilter2 myFilter2;

    @Bean
    public FilterRegistrationBean filterRegistration(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(myFilter);
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("myFilter");
        registrationBean.setOrder(6);
        return registrationBean;
    }
    @Bean
    public FilterRegistrationBean filter2Registration(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(myFilter2);
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("myFilter2");
        registrationBean.setOrder(1);
        return registrationBean;
    }

}
