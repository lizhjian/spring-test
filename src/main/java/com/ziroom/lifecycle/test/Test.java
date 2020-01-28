package com.ziroom.lifecycle.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.ziroom.lifecycle.config.AppConfig;
import com.ziroom.lifecycle.dao.IndexDaoImpl1;
import com.ziroom.lifecycle.service.IndexService;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-01-28 18:16
 * </pre>
 */
public class Test {

    public static void main(String[] args) throws Exception {
        //该方法一旦执行 IndexDaoImpl就被实例化了
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
        //Class<?> clazz1= context.getBean(SqlSessionFactoryBean.class).getClass();
        SqlSessionFactoryBean sqlSessionFactoryBean= (SqlSessionFactoryBean)context.getBean(SqlSessionFactoryBean.class);
        SqlSessionFactoryBean sqlSessionFactoryBean2= (SqlSessionFactoryBean)context.getBean("sqlSessionFactoryBean");
       // SqlSessionFactoryBean sqlSessionFactoryBean1 = (SqlSessionFactoryBean)clazz1.newInstance();
       // SqlSessionFactoryBean sqlSessionFactoryBean2 = (SqlSessionFactoryBean)clazz2.newInstance();
       // System.out.println(sqlSessionFactoryBean1);
        System.out.println(sqlSessionFactoryBean);


        //System.out.println(context.getBean(IndexDaoImpl1.class).getClass());;
    }
}
