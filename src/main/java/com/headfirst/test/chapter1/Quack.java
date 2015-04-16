package com.headfirst.test.chapter1;

/**
 * Created by zhihaoguo on 15/3/13.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
