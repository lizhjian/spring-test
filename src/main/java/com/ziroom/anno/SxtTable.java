package com.ziroom.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 * desc ：注解
 * author ：lizj
 * date ：2020-01-29 10:30
 * </pre>
 */
@Target(value = {ElementType.TYPE}) //定义到类上
@Retention(RetentionPolicy.RUNTIME)
public @interface SxtTable {

    String tableName();

}
