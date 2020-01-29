package com.ziroom.aop.test;

import com.ziroom.aop.app.AppConfig;
import com.ziroom.aop.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2020-01-29 17:31
 * </pre>
 */
public class Test {
    public static void main(String[] args) {
//        xml��ʽʵ��Aop
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-aop.xml");
//        IndexDao indexDao = (IndexDao)context.getBean("indexDao");
//        indexDao.print("abc");


        /*ע�ⷽʽʵ��Aop*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IndexDao indexDao = context.getBean(IndexDao.class);
        indexDao.print("ssss");

    }
}
