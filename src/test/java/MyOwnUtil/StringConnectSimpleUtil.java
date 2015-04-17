package MyOwnUtil;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhihaoguo on 15/4/17.
 */
public class StringConnectSimpleUtil {
    public  void testSimpleStringPlus(){
        //只针对单个的string有不同的前缀后缀
        String[][] ruleSet = {
                {"a", "&", "&","0"},
                {"b", "(", ")","0"},
                {"c", "[", "]","1"},
                {"d", "[", "]","1"},
                {"e", "", "","0"},
                {"f", "", "","0"},

        };
        Map<String,String> strmapset = new HashMap<String, String>();
        strmapset.put("a","a234234");
        strmapset.put("1","1_234234");
        strmapset.put("b","b2123123   ");
        strmapset.put("c","C1   ");
        strmapset.put("d","D1   ");


        String sb = "";
        for (String[] strings : ruleSet) {
            String s = strmapset.get(strings[0]);
            int now= Integer.valueOf(strmapset.get(strings[2]));
            if(StringUtils.isNotBlank(s)){
                sb += strings[1] + strmapset.get(strings[0]) + strings[2];
            }

        }
        System.out.println(sb);
    }
}
