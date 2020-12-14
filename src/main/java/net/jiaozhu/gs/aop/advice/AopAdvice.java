package net.jiaozhu.gs.aop.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AopAdvice {

    @Pointcut("execution (* net.jiaozhu.gs.aop.controller.*.*(..))")
    public void test() {}

    @Before("test()")
    public void beforeAdvice() {
        log.debug("beforeAdvice...");
    }

    @After("test()")
    public void afterAdvice() {
        log.debug("afterAdvice...");
    }

    @Around("test()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        log.debug("before");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        log.debug("after");
    }

}
