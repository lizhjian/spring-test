package com.ziroom.aop.dao;

import com.ziroom.aop.Ziroom;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2020-01-29 17:17
 * </pre>
 */
@Component
@Scope("prototype")
public class IndexDao {
    //@Ziroom
    public void print(String str){
        //System.out.println("str--->"+str);
        System.out.println("IndexDao...."+str);
    }
    //@Ziroom
    public void print(Integer integer){
        //System.out.println("str--->"+str);
        System.out.println("IndexDao...."+integer);
    }
}
