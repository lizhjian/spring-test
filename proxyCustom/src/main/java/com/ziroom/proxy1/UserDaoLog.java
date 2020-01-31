package com.ziroom.proxy1;

import com.ziroom.dao.UserDao;

/**
 * <pre>
 * desc ：TODO
 * author ：lizj
 * date ：2020-01-31 12:28
 * </pre>
 */

public class UserDaoLog implements UserDao {

    private UserDao userDao;

    public UserDaoLog(UserDao userDao) {
        this.userDao = userDao;
    }

    public void query() {
        System.out.println("静态....实现方式....日志");
        userDao.query();
    }
}
