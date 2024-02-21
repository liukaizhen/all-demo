package com.sean.springboot;

import com.sean.springboot.bean.TokenContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sean
 */
public class JwtInterceptor implements HandlerInterceptor {
    private JwtHelper jwtHelper;

    private final AtomicInteger atomicInteger = new AtomicInteger(1);

    public JwtInterceptor(JwtHelper jwtHelper) {
        this.jwtHelper = jwtHelper;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (atomicInteger.getAndIncrement() % 2 ==1 ){
            String token = jwtHelper.sign("user");
            ResponseCookie cookieToken = ResponseCookie.from("X-Token", token)
                    .path("/")
                    .domain("localhost")
                    .maxAge(3600)
                    .sameSite("None")
                    .secure(true)
                    .httpOnly(false)
                    .build();
            response.addHeader(HttpHeaders.SET_COOKIE, cookieToken.toString());

            response.addHeader("SEAN",token);
        }
        TokenContextHolder.setToken(Base64.getEncoder().encodeToString("11111".getBytes()));

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
        TokenContextHolder.removeToken();
    }
}
