package com.ziroom.lifecycle.test;

import com.ziroom.lifecycle.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2020-01-28 18:16
 * </pre>
 */
public class Test {

    public static void main(String[] args) {
        //�÷���һ��ִ�� IndexDaoImpl�ͱ�ʵ������
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);

    }
}
