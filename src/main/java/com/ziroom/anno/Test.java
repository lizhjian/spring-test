package com.ziroom.anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * <pre>
 * desc £ºTODO
 * author £ºlizj
 * date £º2020-01-29 13:18
 * </pre>
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Class clazz  =  Class.forName("com.ziroom.anno.StxStudent");
        Annotation[] annotations =  clazz.getAnnotations();
        for(Annotation a:annotations){
            System.out.println(a);
        }

        SxtTable st = (SxtTable)clazz.getAnnotation(SxtTable.class);
        System.out.println(st.tableName());

        Field field = clazz.getDeclaredField("studentName");
        System.out.println(field);
        SxtField sxtField = field.getAnnotation(SxtField.class);
        System.out.println(sxtField);

    }
}
