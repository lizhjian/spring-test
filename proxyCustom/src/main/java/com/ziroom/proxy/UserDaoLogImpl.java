package com.ziroom.proxy;

import com.ziroom.dao.UserDaoImpl;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2020-01-31 12:22
 * </pre>
 */
//��̬�����еļ̳�
public class UserDaoLogImpl extends UserDaoImpl {
    @Override
    public void query() {
        System.out.println("log.....");
        super.query();
    }
}
