package com.ziroom.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-01-29 17:15
 * </pre>
 */
public class ZiRoomAspectj {

    public void beforeOutPut(JoinPoint jp){

        System.out.println("前置方法...."+jp.getSignature().getName());
    }
    public void afterOutPut(JoinPoint jp){
        System.out.println("后置方法...."+jp.getSignature().getName());
    }
    public Object arountOutPut(ProceedingJoinPoint jp) throws Throwable {
        Object[] args = jp.getArgs();
        for (int i = 0; i < args.length; i++) {
            System.out.println("入参---->"+args[i]);
        }
        System.out.println("环绕方法..前置.." + jp.getSignature().getName());
        Object object = jp.proceed(args);
        System.out.println("环绕方法..后置.." + jp.getSignature().getName());

        return object;
    }
}
