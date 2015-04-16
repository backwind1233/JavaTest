package com.headfirst.test.chapter1;

/**
 * Created by zhihaoguo on 15/3/13.
 */
public class BlueFlyAbstractDuck extends AbstractDuck {

    public BlueFlyAbstractDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void performQuark() {
        quackBehavior.quack();
    }

    @Override
    public void performFly() {
        flyBehavior.fly();
    }
}
