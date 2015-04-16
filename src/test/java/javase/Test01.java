package javase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;

/**
 * Created by zhihaoguo on 15/3/31.
 */
public class Test01 implements Serializable{
    @Before
    public void Before01(){
        System.out.println("this is before01");
    }

    @Before

    public void Before02(){
        System.out.println("this is before02");
    }

    @Before
    public void Before03(){
        System.out.println("this is before03");
    }

    @Test
    public void startTest() {
        String s = "String";
        Assert.assertEquals("MUST THE SAME", "String", s);
        System.out.println("this is my first Test");
    }

    @Test
    public void after(){
        System.out.println("this is after");
    }
}
