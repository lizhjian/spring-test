package com.ziroom.proxy1;

import com.ziroom.dao.UserDao;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-01-31 12:28
 * </pre>
 */

public class UserDaoTime implements UserDao {

    private UserDao userDao;

    public UserDaoTime(UserDao userDao) {
        this.userDao = userDao;
    }

    public void query() {
        System.out.println("静态....实现方式....时间");
        userDao.query();
    }
}
