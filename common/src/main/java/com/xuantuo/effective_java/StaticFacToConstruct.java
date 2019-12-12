package com.xuantuo.effective_java;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import com.xuantuo.constant.Rank;
import com.xuantuo.objects.StackWalker;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.file.Files;
import java.sql.Date;
import java.time.Instant;
import java.util.Collections;
import java.util.EnumSet;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/12/12
 **/
public class StaticFacToConstruct {


    public void cases() {

        //  from 只有单个参数，类型转换方法
        Date.from(Instant.now());

        //  of聚合方法
        EnumSet<Rank> jack = EnumSet.of(Rank.JACK, Rank.QUEEN, Rank.KING);

        //  valueOf
        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);

        //  instance或者getInstance 返回已有实例
        StackWalker luke = StackWalker.getInstance("luke");

        //  create或者newInstance  返回新的实例
        Object o = Array.newInstance(StackWalker.class, 10);

        //  getType
        //Files.getFileStore(path);

        //  newType
        //Files.newBufferedReader(path);

        //  type--getType和newType的简版
        //Collections.list();


    }

    public static void main(String[] args) {
        //  instance或者getInstance
        StackWalker luke = StackWalker.getInstance("AA");

        System.out.println(luke.name);
    }


}
