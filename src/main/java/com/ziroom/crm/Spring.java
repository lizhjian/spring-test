package com.ziroom.crm;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * <pre>
 * desc ��������������spring.xml
 * author ��lizj
 * date ��2020-01-27 23:14
 * </pre>
 */
@Configuration  //�������Ǹ������ļ�
@ComponentScan("com.ziroom")  //����ɨ�貢����com.ziroom
@ImportResource("classpath:spring.xml") //����Ҫ����spring.xml�ļ�
public class Spring {
}
