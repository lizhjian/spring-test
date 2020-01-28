package com.ziroom.lifecycle.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * <pre>
 * desc spring生命周期回调
 * author ：lizj
 * date ：2020-01-28 18:12
 * </pre>
 */
@Configuration
@ComponentScan("com.ziroom.lifecycle")
@ImportResource("classpath:spring-lifecycle.xml")
public class AppConfig {
}
