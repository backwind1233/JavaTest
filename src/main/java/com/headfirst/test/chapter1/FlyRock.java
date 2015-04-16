package com.headfirst.test.chapter1;

/**
 * Created by zhihaoguo on 15/3/13.
 */
public class FlyRock implements  FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly with a rocket");
    }
}
