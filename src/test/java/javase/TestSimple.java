package javase;

/**
 * Created by zhihaoguo on 15/4/9.
 */
public class TestSimple {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class s =Class.forName("Simple");
        Simple simple= (Simple) s.newInstance();
//        Simple simple=new Simple();

    }


}
