package com.xuantuo.concurrent.threadpool;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/12/23
 **/
public class Task1 implements Callable {

    String s;

    public Task1(String s) {
        this.s = s;
    }

    @Override
    public Object call() throws Exception {

        System.out.println(s);
        int i = (new Random()).nextInt(8000);
        Thread.sleep(i);
        System.out.println(s + ":ok:" + i);
        return s + "+";
    }
}
