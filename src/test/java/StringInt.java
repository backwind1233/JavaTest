import org.junit.Test;

import java.util.*;

/**
 * Created by zhihaoguo on 15/4/3.
 */
public class StringInt {
    @Test
    public void test() {
        int id = 0;
        String str = "www.biadu.com/" + id;



        System.out.println(str);
    }


    @Test
    public void testSize() {
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(1);
        ls.add(1);
        ls.add(1);
        ls.add(1);
        System.out.println(ls.size());

    }

    @Test
    public void testRandom() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int seed = random.nextInt(3) + 1;
            System.out.println(seed);


        }
    }

    @Test
    public void testD() {
        String S = "·婚宴 SDFSLDFHLK";
        System.out.println(S.contains("·婚宴"));
        S.replaceAll("", "·婚宴");
        S.replaceAll("·婚宴", "");
        S.replace("", "·婚宴");
        System.out.println(S.replaceAll("·婚宴", ""));
    }

    @Test
    public void TestDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        Date date = cal.getTime();
        System.out.println(date);
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) - 1);
        date = cal.getTime();
        System.out.println(date);
    }


}
