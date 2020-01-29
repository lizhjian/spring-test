package com.ziroom.aop.test;

import com.ziroom.aop.app.AppConfig;
import com.ziroom.aop.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-01-29 17:31
 * </pre>
 */
public class Test {
    public static void main(String[] args) {
//        xml方式实现Aop
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-aop.xml");
//        IndexDao indexDao = (IndexDao)context.getBean("indexDao");
//        indexDao.print("abc");


        /*注解方式实现Aop*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IndexDao indexDao = context.getBean(IndexDao.class);
        indexDao.print("ssss");

    }
}
