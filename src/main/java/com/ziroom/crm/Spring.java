package com.ziroom.crm;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * <pre>
 * desc ：用这个类来替代spring.xml
 * author ：lizj
 * date ：2020-01-27 23:14
 * </pre>
 */
@Configuration  //代表这是个配置文件
@ComponentScan("com.ziroom")  //代表扫描com.ziroom
@ImportResource("classpath:spring.xml") //代表我加载spring.xml文件
public class Spring {
}
