package com.headfirst.test.chapter1;

/**
 * Created by zhihaoguo on 15/3/13.
 */
public class MainTest {
    public static void main(final String[] args) {
        final AbstractDuck duck = new BlueFlyAbstractDuck();
        duck.performFly();
        duck.performQuark();
        duck.setFlyBehavior(new FlyRock());
        System.out.println("after----------");
        duck.performFly();
        duck.performQuark();
    }

}
