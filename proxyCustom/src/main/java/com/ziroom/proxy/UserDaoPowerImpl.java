package com.ziroom.proxy;

import com.ziroom.dao.UserDaoImpl;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2020-01-31 12:22
 * </pre>
 */
//
public class UserDaoPowerImpl extends UserDaoImpl {
    @Override
    public void query() {
        System.out.println("power.....");
        super.query();
    }
}
