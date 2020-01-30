package com.ziroom.aop.advice;

import com.ziroom.aop.dao.Dao;
import com.ziroom.aop.dao.IndexDao;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2020-01-29 17:15
 * </pre>
 */
@Component
@Aspect("perthis(this(com.ziroom.aop.dao.IndexDao))")
@Scope("prototype")
public class ZiRoomAspectj {

//    @DeclareParents(value = "com.ziroom.aop.dao.*" ,defaultImpl = IndexDao.class)
//    private static Dao dao;

    @Pointcut("execution(* com.ziroom.aop.dao.*.*(*))")
    public void pointCut(){

    }
    //�д�ע��ķ���
//    @Pointcut("@annotation(com.ziroom.aop.Ziroom)")
//    public void pointCutAnno(){
//
//    }

    @Before("pointCut()")
    public void beforeOutPut(JoinPoint jp){
        System.out.println("hashCode-->"+this.hashCode());
        System.out.println("--------"+jp.getThis());
        System.out.println("--------"+jp.getTarget());
        System.out.println("ǰ�÷���...."+jp.getSignature().getName());
    }
    //@Before("pointCutAnno()")
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
