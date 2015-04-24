package com.MyOwnUtil;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhihaoguo on 15/4/17.
 */
public class StringConnectUtil {


    private static final String CONNECT = "1";
    private static final String DISCONNECT = "0";


    /**
     * @param ruleSet:规则集
     * @param stringMaps:对应的map
     * @return
     */
    public static String StringConnect(String[][] ruleSet, Map<String, String> stringMaps) {
//        String[][] ruleSet = {
//                {"a", "&", "&", "0"},
//                {"b", "(", ")", "0"},
//                {"c", "[", "]", "1"},
//                {"d", "[", "]", "1"},
//                {"e", "[", "]", "1"},
//                {"f", "^", "^", "0"},
//                {"name", "+++", "+++", "0"}
//        };
//        Map<String, String> stringMaps = new HashMap<String, String>();
//        stringMaps.put("a", "a234234");
//        stringMaps.put("1", "1_234234");
//        stringMaps.put("b", "b2123123   ");
//        stringMaps.put("c", "C1   ");
//        stringMaps.put("d", "D1");
//        stringMaps.put("e", "");
//        stringMaps.put("f", " ui k");
//        stringMaps.put("name", " 123123123123 k");
//        stringMaps.put("st", " ui k");
//        stringMaps.put("this", " ui k");
//        stringMaps.put("efef", " ui k");
//        stringMaps.put("thisis", " ui k");

        if (ruleSet == null)
            return "";

        StringBuffer sb = new StringBuffer();
        State st = new State();

        for (String[] strings : ruleSet) {
            String value = stringMaps.get(strings[0]);
            if (DISCONNECT.equals(strings[3])) {
                if (StringUtils.isNotEmpty(st.getSufString()) && st.getState() == 1) {
                    sb.append(st.getSufString());
                    st.setState(0);
                }
                if (StringUtils.isNotBlank(value)) {
                    sb.append(strings[1] + value + strings[2]);
                }
            } else if (CONNECT.equals(strings[3])) {
                if (StringUtils.isNotBlank(value)) {
                    if (st.getState() == 0) {
                        st.setState(1);
                        sb.append(strings[1] + value);
                        st.setSufString(strings[2]);
                    } else if (st.getState() == 1) {
                        sb.append(value);
                        st.setSufString(strings[2]);
                    }
                }

            }

        }
        if (st.getState() == 1)
            sb.append(st.getSufString());
        return sb.toString();
    }

}
