package com.ziroom.aop.dao;

import org.springframework.stereotype.Component;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2020-01-29 17:17
 * </pre>
 */
@Component
public class IndexDao {

    public void print(String str){
        //System.out.println("str--->"+str);
        System.out.println("IndexDao....");
    }
}
