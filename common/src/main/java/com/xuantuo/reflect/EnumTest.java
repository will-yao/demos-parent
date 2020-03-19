package com.xuantuo.reflect;

import sun.reflect.ReflectionFactory;

import java.lang.reflect.Constructor;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/3/19
 **/
public class EnumTest {


    public static void main(String[] args) {
        try {

            Constructor cstr = HumanState.class.getDeclaredConstructor(
                    String.class,int.class,long.class, String.class, String.class
            );
            //Constructor cstr = HumanState.class.getDeclaredConstructors()[0];
            ReflectionFactory reflection =
                    ReflectionFactory.getReflectionFactory();
            HumanState e =
                    (HumanState) reflection.newConstructorAccessor(cstr).newInstance(new Object[]{"ANGRY",-1, 88L, "a", "a"});
            System.out.printf("%s = %d\n", e.toString(), e.ordinal());

        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }

    }
}
