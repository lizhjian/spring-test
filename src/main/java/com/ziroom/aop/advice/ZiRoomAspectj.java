package com.ziroom.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2020-01-29 17:15
 * </pre>
 */
@Component
@Aspect
public class ZiRoomAspectj {

    @Pointcut("execution(* com.ziroom.aop.dao.*.*(*))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void beforeOutPut(JoinPoint jp){

        System.out.println("ǰ�÷���...."+jp.getSignature().getName());
    }
    public void afterOutPut(JoinPoint jp){
        System.out.println("���÷���...."+jp.getSignature().getName());
    }
    public Object arountOutPut(ProceedingJoinPoint jp) throws Throwable {
        Object[] args = jp.getArgs();
        for (int i = 0; i < args.length; i++) {
            System.out.println("���---->"+args[i]);
        }
        System.out.println("���Ʒ���..ǰ��.." + jp.getSignature().getName());
        Object object = jp.proceed(args);
        System.out.println("���Ʒ���..����.." + jp.getSignature().getName());

        return object;
    }
}
