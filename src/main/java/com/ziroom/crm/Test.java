package com.ziroom.crm;

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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IndexService indexService = (IndexService)context.getBean("indexService");
        indexService.print();
    }
}
