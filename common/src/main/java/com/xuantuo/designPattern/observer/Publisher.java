package com.xuantuo.designPattern.observer;

import java.nio.ByteBuffer;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/1/9
 **/
public class Publisher {

    public static void main(String[] args) {

        ByteBuffer header = ByteBuffer.allocate(24);
        header.putLong(1L);
        header.putLong(22L);
        header.putLong(333L);
        //System.out.println(header.getLong());
        header.flip();
        //header.getLong();
        System.out.println(header.getLong(0));
        System.out.println(header.getLong());
        header.flip();
        System.out.println(header.getLong());
    }
}
