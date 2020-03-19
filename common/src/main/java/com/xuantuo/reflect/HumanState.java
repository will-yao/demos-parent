package com.xuantuo.reflect;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/3/19
 **/
public enum HumanState {
    HAPPY(1L,"h","h"), SAD(2L,"s","s");


    private long l;
    private String s1;
    private String s2;

    HumanState(long l, String s1, String s2) {
        this.l = l;
        this.s1 = s1;
        this.s2 = s2;
    }
}
