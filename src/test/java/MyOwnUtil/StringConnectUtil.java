package MyOwnUtil;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhihaoguo on 15/4/17.
 */
public class StringConnectUtil {
    @Test
    public void StringConnect() {
        String[][] ruleSet = {
                {"a", "&", "&", "0"},
                {"b", "(", ")", "0"},
                {"c", "[", "]", "1"},
                {"d", "[", "]", "1"},
                {"e", "", "", "0"},
                {"f", "", "", "0"},
        };
        Map<String, String> strmapset = new HashMap<String, String>();
        strmapset.put("a", "a234234");
        strmapset.put("1", "1_234234");
        strmapset.put("b", "b2123123   ");
        strmapset.put("c", "C1   ");
        strmapset.put("d", "D1   ");


        String sb = "";
        state st = new state();
        for (String[] strings : ruleSet) {
            String s = strmapset.get(strings[0]);
            if ("0".equals(strings[3])) {
                if (StringUtils.isNotEmpty(st.getEx()) && st.getState() == 1) {
                    sb += st.getEx();
                    st.setState(0);
                }
                if (StringUtils.isNotBlank(s)) {
                    sb += strings[1] + s + strings[2];
                }
            } else if ("1".equals(strings[3])) {
                if (st.getState() == 0) {
                    st.setState(1);
                    if (StringUtils.isNotBlank(s)) {
                        sb += strings[1] + s;
                    }
                } else if (st.getState() == 1) {
                    if (StringUtils.isNotBlank(s)) {
                        sb += s;
                        st.setEx(strings[2]);
                    }

                }

            }

        }
        System.out.println(sb);


    }

    class state {
        String pre;
        String ex;
        int state;

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public boolean isCon() {
            return con;
        }

        public void setCon(boolean con) {
            this.con = con;
        }

        public String getPre() {
            return pre;
        }

        public void setPre(String pre) {
            this.pre = pre;
        }

        public String getEx() {
            return ex;
        }

        public void setEx(String ex) {
            this.ex = ex;
        }

        boolean con;
    }

}
