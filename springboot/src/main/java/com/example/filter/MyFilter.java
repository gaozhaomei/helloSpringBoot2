package com.example.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@Slf4j
@Component
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("过滤器1开始了");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        System.out.println("this is MyFilter,url is "+request.getRequestURI());
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("过滤器1结束了");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
