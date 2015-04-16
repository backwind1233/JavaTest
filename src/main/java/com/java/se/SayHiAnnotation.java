package com.java.se;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhihaoguo on 15/3/27.
 */
@Retention(RetentionPolicy.RUNTIME)// 表示注解在运行时依然存在
@Target({ElementType.METHOD,ElementType.TYPE})//标识注解可以应用于类和方法
public @interface SayHiAnnotation {
    String value() default "jone"; // 表示我的注解需要一个参数 名为"value" 默认值为"johne"
}
