package com.ziroom.lifecycle.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2020-01-28 18:14
 * </pre>
 */
@Component
//@Lazy
public class IndexDaoImpl1 implements IndexDao,InitializingBean,DisposableBean {

    public IndexDaoImpl1() {
        System.out.println("IndexDaoImpl...constructor ");
    }

    //���췽��֮��ִ�и÷���
    public void afterPropertiesSet() throws Exception {

        System.out.println("init11");
    }

    //�������ٵ�ʱ��ִ�и÷���
    public void destroy() throws Exception {
        System.out.println("destroy");

    }

    public void init(){
        System.out.println("default  init ");
    }
    @PostConstruct
    public void init2(){
        System.out.println("default  init ...1 .. ");
    }
}
