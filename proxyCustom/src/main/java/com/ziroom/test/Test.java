package com.ziroom.test;

import com.ziroom.dao.UserDao;
import com.ziroom.dao.UserDaoImpl;
import com.ziroom.proxy.UserDaoLogImpl;
import com.ziroom.proxy1.UserDaoLog;
import com.ziroom.proxy1.UserDaoTime;

/**
 * <pre>
 * desc ������
 * author ��lizj
 * date ��2020-01-31 12:23
 * </pre>
 */
public class Test {
    public static void main(String[] args) {
        //��̬����(�̳�)
//        UserDaoLogImpl userDaoLog = new UserDaoLogImpl();
//        userDaoLog.query();

        //��̬����(ʵ��)
        // UserDao target = new UserDaoImpl();
         //UserDaoLog:�Ѿ����ʵ���ഫ����,������ִ��
//         UserDaoLog userDaoLog = new UserDaoLog(target);
//         userDaoLog.query();
        //���ʱ��Ĵ���
//         UserDaoTime userDaoTime = new UserDaoTime(target);
//         userDaoTime.query();
         //���ʱ��+ ��־�Ĵ���
        UserDao target = new UserDaoLog(new UserDaoImpl());

        UserDao proxy = new UserDaoTime(target);

        proxy.query();




    }
}
