import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhihaoguo on 15/4/16.
 */
public class JavaTest {
    @Test
    public void TestBreak() {
        String str = "";
        int i = 0;
        while (i < 4) {
            if (i == 2) {
                i++;
                continue;
            }
            str += i;
            i++;

        }
        System.out.println(str);
    }
    @Test
    public void TestIterator(){
        List<Integer> ls = Arrays.asList(1,2,3,5);
        String  s = "";

        for (Integer l : ls) {
            if (l == 2)
                continue;
            s += l;

        }
        System.out.println(s);
    }
}
