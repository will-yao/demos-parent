package com.xuantuo.concurrent.threadpool;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static java.lang.Thread.sleep;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/12/23
 **/
public class FixedDemo {

    private static ExecutorService pool = Executors.newFixedThreadPool(10);
    private static ExecutorService singleTh = Executors.newSingleThreadExecutor();

    //ThreadPoolTaskExecutor tt = new ThreadPoolTaskExecutor();


    public List process(List<String> list) {

        List<Future<String>> futures = new ArrayList<>();

        List<String> res = Lists.newLinkedList();

        list.forEach(s -> futures.add(pool.submit(new Task1(s))));

        for (Future<String> future : futures) {

            try {
                res.add(future.get(10, TimeUnit.SECONDS));
            } catch (TimeoutException t) {
                t.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return res;

    }

    public static void main(String[] args) {


        System.out.println(StringUtils.endsWith("sssssss", "_prior"));

        System.out.println(StringUtils.endsWith("sssssss_prior", "_prior"));
        System.out.println(StringUtils.endsWith("sssssss-prior", "_prior"));

        singleTh.execute(() -> {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("aa");
        });
        System.out.println("xx");
        singleTh.execute(() -> {
            System.out.println("bb");
        });
        singleTh.execute(() -> {
            System.out.println("cc");
        });

        singleTh.shutdown();


    }
}
