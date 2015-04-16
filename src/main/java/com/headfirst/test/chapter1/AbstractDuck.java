package com.headfirst.test.chapter1;

/**
 * Created by zhihaoguo on 15/3/13.
 */
public abstract  class AbstractDuck {
    //    public abstract void quack();
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("global swim");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("global display");

    }

    public abstract void performQuark();
    public abstract  void performFly();
}
