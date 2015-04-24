package javase;

import com.MyOwnUtil.StringConnectUtil;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.*;

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
    public void TestIterator() {
        List<Integer> ls = Arrays.asList(1, 2, 3, 5);
        String s = "";

        for (Integer l : ls) {
            if (l == 2)
                continue;
            s += l;

        }
        System.out.println(s);
    }

    @Test
    public void TestContains() {
        String s = " ";
        System.out.println(StringUtils.isEmpty(s));
    }


    @Test
    public void testStrplus() {
        String[][] ruleSet = {
                {"a", "&", "&", "0"},
                {"b", "(", ")", "0"},
                {"c", "[", "]", "1"},
                {"d", "*", "*", "1"},
                {"e", "", "", "0"},
                {"f", "", "", "0"},
                {"k", "%%", "%%", "0"}


        };
        Map<String, String> strmapset = new HashMap<String, String>();
        strmapset.put("a", "a234234");
        strmapset.put("1", "1_234234");
        strmapset.put("b", "b2123123   ");
        strmapset.put("d", "D1   ");
        strmapset.put("k", "kkkk------");



        String result = StringConnectUtil.StringConnect(ruleSet, strmapset);

        System.out.println(result);


    }
}
