package com.xuantuo.concurrent.threadpool;

import com.google.common.collect.Lists;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/12/23
 **/
public class FixedDemo {

    private ExecutorService pool = Executors.newFixedThreadPool(10);

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
}
