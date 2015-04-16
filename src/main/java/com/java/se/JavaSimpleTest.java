package com.java.se;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.UnsupportedEncodingException;

import java.util.Date;

/**
 * Created by zhihaoguo on 15/3/5.
 */
public class JavaSimpleTest {


    public static void main(String[] args) throws UnsupportedEncodingException {
        PropertyConfigurator.configure("/Users/plato1233/Git/wprivate static Logger logger = Logger.getLogger(JavaSimpleTest.class);edding-contentcrawl-job/src/main/resources/log4j.properties");
        Logger logger = Logger.getLogger(JavaSimpleTest.class);
//        System.out.println(Integer.valueOf("123"));
//        String simple = "a,b,c,d,e";
//        System.out.println(simple);
//        System.out.println(simple.replace('/','{'));

//        char ch ='a';
//        String S="你好";
//
//        System.out.println(S.length());
//
//
//        System.out.println(S.getBytes(Charset.forName("UTF-16")).length);
//
//        String str = "中国的";
//        System.out.println(Charset.defaultCharset());
//        System.out.println(str.getBytes("UTF-8").length);

//        List<Integer> ls =new LinkedList<Integer>();
//        ls.add(1);
//        ls.add(2);
//
//        ls.add(3);
//        ls.add(4);
//        System.out.println(ls.size());
//        System.out.println(ls.get(2));
        Date date = new Date(2014 - 1900, 8 - 1, 1);
        if (1 > 2)
            logger.warn("hehe");
        else
            logger.warn("not hehe");
        logger.error("o");


//        System.out.println (1L<<32);
//        System.out.println (1<<32);
    }
//
//    class innner(){
//        int a;
//        int b;
//        String ni;
//    }
}
