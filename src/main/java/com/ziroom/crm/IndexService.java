package com.ziroom.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <pre>
 * desc ：service
 * author ：lizj
 * date ：2020-01-27 20:21
 * </pre>
 */
@Component("indexService")
public class IndexService {

    @Resource
    private IndexDao indexDaoImpl1;

    public void print(){
        indexDaoImpl1.daoPrint();
    }
    //根据set方法注入
//    public void setIndexDaoImpl2(IndexDao dao) {
//        this.indexDaoImpl2 = dao;
//    }

//    public IndexService(IndexDao dao) {
//        this.dao = dao;
//    }
}
