package com.xuantuo.objects;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/12/12
 **/
public class StackWalker {


    public String name;

    private static Map<String, StackWalker> map;

    static {
        map = Maps.newHashMap();
        map.put("luke", new StackWalker("luke"));
        map.put("AA", new StackWalker("AA"));
        map.put("EE", new StackWalker("EE"));
    }


    public StackWalker(String name) {
        this.name = name;
    }

    public static StackWalker getInstance(String options) {
        return map.get(options);
    }


}
