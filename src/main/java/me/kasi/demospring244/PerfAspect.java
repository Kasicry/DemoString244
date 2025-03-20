package me.kasi.demospring244;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component // 빈으로 등록하느 어노테이션
@Aspect
public class PerfAspect {

//    @Around("execution(* me.kasi.demospring244.EventService.*(..))") // pointcut 정의
//    @Around("@annotation(PerLogging)") // pointcut 정의
    @Around("bean(simpleEventService)") // pointcut 정의
    // advice 시작
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis()- begin);

        return retVal;
    }
    // advice 끝

    @Before("bean(simpleEventService)") // 모든 메서드 실행 이전에 동작하는 어노테이션
    public void hello(){
        System.out.println("hello");
    }

}
