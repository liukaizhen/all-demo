package com.sean.springboot.aop;

import com.sean.springboot.bean.TokenContextHolder;
import com.sean.springboot.bean.TokenResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author sean
 */
@Aspect
@Component
public class TokenAop {
    public TokenAop() {
    }

    @Pointcut("@annotation(com.sean.springboot.annotation.ReturnToken))")
    public void pointcut1() {
    }

    @Pointcut("@within(com.sean.springboot.annotation.ReturnToken)")
    public void pointcut2() {
    }

    @Around("pointcut1() || pointcut2()")
    public Object checkToken(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object obj = proceedingJoinPoint.proceed();
        if (obj instanceof TokenResult){
            ((TokenResult) obj).setToken(TokenContextHolder.getToken());
        }
        return obj;
    }
}
