package com.ziroom.aop.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <pre>
 * desc ��TODO
 * author ��lizj
 * date ��2020-01-29 18:01
 * </pre>
 */
@Configuration
@ComponentScan("com.ziroom.aop")  //ɨ�������
@EnableAspectJAutoProxy
public class AppConfig {
}
