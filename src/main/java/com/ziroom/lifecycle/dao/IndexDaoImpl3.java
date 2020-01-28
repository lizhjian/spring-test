package com.ziroom.lifecycle.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Profile;
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
@Profile("dao3")
//@Lazy
public class IndexDaoImpl3 implements IndexDao,InitializingBean,DisposableBean {

    public IndexDaoImpl3() {
        System.out.println("IndexDaoImpl...constructor ");
    }

    //���췽��֮��ִ�и÷���
    public void afterPropertiesSet() throws Exception {

        System.out.println("init33");
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
        System.out.println("default  init ...4 .. ");
    }
}
