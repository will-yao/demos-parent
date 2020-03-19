package com.xuantuo.concurrent.threadpool;

import org.apache.commons.lang3.BooleanUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/12/23
 **/
public class Tmain {
    public static void main(String[] args) {

        boolean aTrue = BooleanUtils.isTrue(null);

        System.out.println(aTrue);

        FixedDemo demo = new FixedDemo();

        List<String> taskList1 = Arrays.asList("1", "2", "3", "4", "5");

        List<String> taskList2 = Arrays.asList("a", "b", "c", "d", "e");

        System.out.println("taskList1");



        new Thread(new Runnable() {
            @Override
            public void run() {
                List process = demo.process(taskList1);
                System.out.println("new t finish");
                try {
                    Thread.sleep(20000)
    ;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(":::"+process.size());
                process.forEach(s -> System.out.println(s));
            }
        }).start();


        System.out.println("taskList2");
        demo.process(taskList2).forEach(s -> System.out.println(s));


        System.out.println("-------------------");
        //pool.shutdown();
    }

}
