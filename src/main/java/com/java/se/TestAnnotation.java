package com.java.se;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by zhihaoguo on 15/3/27.
 */
public class TestAnnotation {

    public static void main(String[] args) {
        SayHiEmlement sayHiEmlement = new SayHiEmlement();
        SayHiEmlementDef sayHiEmlementDef = new SayHiEmlementDef();
        Annotation annotation[]=SayHiEmlement.class.getDeclaredAnnotations();
        //如果是方法，拿注解的方法就不一样了
        String value = SayHiEmlement.class.getAnnotation(SayHiAnnotation.class).value();
        String valueDef = SayHiEmlementDef.class.getAnnotation(SayHiAnnotation.class).value();
        System.out.println("value, " + value);
        System.out.println("valueDef, " + valueDef);
    }

}
