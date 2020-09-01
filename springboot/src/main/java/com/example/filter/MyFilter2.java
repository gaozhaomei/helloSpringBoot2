package com.example.filter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@Slf4j
@Component
public class MyFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("过滤器2开始了");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        System.out.println("this is myFilter2, url is "+request.getRequestURI());
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("过滤器2结束了");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
