package com.ziroom.test;

import com.ziroom.dao.UserDao;
import com.ziroom.dao.UserDaoImpl;
import com.ziroom.proxy.UserDaoLogImpl;
import com.ziroom.proxy1.UserDaoLog;
import com.ziroom.proxy1.UserDaoTime;

/**
 * <pre>
 * desc ：代理
 * author ：lizj
 * date ：2020-01-31 12:23
 * </pre>
 */
public class Test {
    public static void main(String[] args) {
        //静态代理(继承)
//        UserDaoLogImpl userDaoLog = new UserDaoLogImpl();
//        userDaoLog.query();

        //静态代理(实现)
        // UserDao target = new UserDaoImpl();
         //UserDaoLog:把具体的实现类传进来,我替你执行
//         UserDaoLog userDaoLog = new UserDaoLog(target);
//         userDaoLog.query();
        //完成时间的代理
//         UserDaoTime userDaoTime = new UserDaoTime(target);
//         userDaoTime.query();
         //完成时间+ 日志的代理
        UserDao target = new UserDaoLog(new UserDaoImpl());

        UserDao proxy = new UserDaoTime(target);

        proxy.query();




    }
}
