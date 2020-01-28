package com.ziroom.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
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
@Scope("singleton")
public abstract class IndexService {

//    @Resource
//    private IndexDao indexDa;
//

    @Lookup
    public abstract IndexDao getIndexDa();

    public void print(){
        System.out.println(this.hashCode());
        System.out.println(getIndexDa().hashCode());
    }
    //根据set方法注入
//    public void setIndexDaoImpl2(IndexDao dao) {
//        this.indexDaoImpl2 = dao;
//    }

//    public IndexService(IndexDao dao) {
//        this.dao = dao;
//    }
}
