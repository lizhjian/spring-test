package com.ziroom.lifecycle.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
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
@Profile("dao1")
//@Lazy
public class IndexDaoImpl1 implements IndexDao,InitializingBean,DisposableBean {

    public IndexDaoImpl1() {
        System.out.println("IndexDaoImpl...constructor ");
    }

    //构造方法之后执行该方法
    public void afterPropertiesSet() throws Exception {

        System.out.println("init11");
    }

    //容器销毁的时候执行该方法
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
