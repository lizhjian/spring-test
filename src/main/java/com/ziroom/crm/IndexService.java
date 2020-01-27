package com.ziroom.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * desc ：service
 * author ：lizj
 * date ：2020-01-27 20:21
 * </pre>
 */
@Component("indexService")
public class IndexService {

    @Autowired
    private IndexDao dao;

    public void print(){
        dao.daoPrint();
    }
    //根据set方法注入
//    public void setDao(IndexDao dao) {
//        this.dao = dao;
//    }

//    public IndexService(IndexDao dao) {
//        this.dao = dao;
//    }
}
