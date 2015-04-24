package com.MyOwnUtil;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhihaoguo on 15/4/17.
 */
public class StringConnectUtil {
    public static String StringConnect(String[][] ruleSet,Map<String, String> stringMaps) {

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



        StringBuffer sb = new StringBuffer();
        State st = new State();
        if (ruleSet == null)
            return "ruleSet is null" ;
        for (String[] strings : ruleSet) {
            String value = stringMaps.get(strings[0]);
            if ("0".equals(strings[3])) {
                if (StringUtils.isNotEmpty(st.getSufString()) && st.getState() == 1) {
                    sb.append(st.getSufString()) ;
                    st.setState(0);
                }
                if (StringUtils.isNotBlank(value)) {
                    sb.append(strings[1] + value + strings[2]);
                }
            } else if ("1".equals(strings[3])) {
                if (st.getState() == 0) {
                    st.setState(1);
                    if (StringUtils.isNotBlank(value)) {
                        sb.append(strings[1] + value);
                    }
                } else if (st.getState() == 1) {
                    if (StringUtils.isNotBlank(value)) {
                        sb.append(value);
                        st.setSufString(strings[2]);
                    }

                }

            }

        }
        System.out.println(sb);


        return null;
    }

//    static class State {
//        String preString;
//        String sufString;
//        boolean condition;
//        int state;
//
//        public String getPreString() {
//            return preString;
//        }
//
//        public void setPreString(String preString) {
//            this.preString = preString;
//        }
//
//        public String getSufString() {
//            return sufString;
//        }
//
//        public void setSufString(String sufString) {
//            this.sufString = sufString;
//        }
//
//        public boolean isCondition() {
//            return condition;
//        }
//
//        public void setCondition(boolean condition) {
//            this.condition = condition;
//        }
//
//        public int getState() {
//            return state;
//        }
//
//        public void setState(int state) {
//            this.state = state;
//        }
//    }

}
