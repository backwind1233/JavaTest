package com.java.se;

/**
 * Created by zhihaoguo on 15/3/27.
 */
@SayHiAnnotation("zhihao")
public class SayHiEmlement {
    public void SayHiDefault(String name) {
        System.out.println("Hi, " + name);
    }
    public void SayHiAnnotation(String name) {
        System.out.println("hi, " + name);
    }

}
