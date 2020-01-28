package com.ziroom.crm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * desc ：ioc的三种注入方法
 * author ：lizj
 * date ：2020-01-27 21:20
 * </pre>
 */
public class Test {
    public static void main(String[] args) {

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //第三种方式 通过一个Spring.class类
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(Spring.class);

        IndexService indexService1 = (IndexService)context.getBean("indexService");
        IndexService indexService2 = (IndexService)context.getBean("indexService");
        indexService1.print();
        indexService2.print();

    }
}
