package com.ziroom.proxy;

import com.ziroom.dao.UserDaoImpl;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-01-31 12:22
 * </pre>
 */
//静态代理中的继承
public class UserDaoLogImpl extends UserDaoImpl {
    @Override
    public void query() {
        System.out.println("log.....");
        super.query();
    }
}
