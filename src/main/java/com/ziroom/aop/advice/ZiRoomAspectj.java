package com.ziroom.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2020-01-29 17:15
 * </pre>
 */
public class ZiRoomAspectj {

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
