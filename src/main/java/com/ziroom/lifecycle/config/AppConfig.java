package com.ziroom.lifecycle.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


/**
 * <pre>
 * desc spring生命周期回调
 * author ：lizj
 * date ：2020-01-28 18:12
 * </pre>
 */
@Configuration
@ComponentScan(value = "com.ziroom.lifecycle")
//@ComponentScan(value = "com.ziroom.lifecycle",excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX,pattern = "com.ziroom.lifecycle.*")})
//@ImportResource("classpath:spring-lifecycle.xml")
public class AppConfig {

    @Bean
    @Autowired
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("123456");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/crm");
        return driverManagerDataSource;
    }



}
