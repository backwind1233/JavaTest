package com.MyOwnUtil;

/**
 * Created by zhihaoguo on 15/4/19.
 */
public class State {
    String preString;
    String sufString;
    boolean condition;
    int state;

    public String getPreString() {
        return preString;
    }

    public void setPreString(String preString) {
        this.preString = preString;
    }

    public String getSufString() {
        return sufString;
    }

    public void setSufString(String sufString) {
        this.sufString = sufString;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
