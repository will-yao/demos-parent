package com.xuantuo.lambda;

import java.util.stream.IntStream;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/22
 **/
public class IntStreamTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Get set...");
        int test = 10;

        IntStream.range(0,test).forEach(i -> System.out.println(i +"..."));
    }
}
