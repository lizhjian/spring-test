package com.ziroom.ioc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2020-01-27 20:21
 * </pre>
 */
@Repository
@Scope("prototype")
public class IndexDaoImpl1 implements IndexDao {

    public void daoPrint() {
        System.out.println("indexDao..1...");
    }
}
