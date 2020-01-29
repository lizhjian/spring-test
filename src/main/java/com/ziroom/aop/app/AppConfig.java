package com.ziroom.aop.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2020-01-29 18:01
 * </pre>
 */
@Configuration
@ComponentScan("com.ziroom.aop")  //É¨ÃèÕâ¸ö°ü
@EnableAspectJAutoProxy
public class AppConfig {
}
