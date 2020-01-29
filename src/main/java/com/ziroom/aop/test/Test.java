package com.ziroom.aop.test;

import com.ziroom.aop.dao.IndexDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2020-01-29 17:31
 * </pre>
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-aop.xml");
        IndexDao indexDao = (IndexDao)context.getBean("indexDao");
        indexDao.print("abc");
    }
}
