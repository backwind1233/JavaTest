package com.java.se;

/**
 * Created by plato1233 on 15/3/3.
 */
public enum Week {
    MON("星期一");
    private String name;


    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
