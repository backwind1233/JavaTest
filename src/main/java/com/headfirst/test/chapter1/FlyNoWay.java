package com.headfirst.test.chapter1;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by zhihaoguo on 15/3/13.
 */
public class FlyNoWay implements   FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
