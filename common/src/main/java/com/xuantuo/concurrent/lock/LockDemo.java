package com.xuantuo.concurrent.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/12/23
 **/
public class LockDemo {



    public static void main(String[] args) {


        ReentrantLock lock = new ReentrantLock(true);

        Condition aCondition = lock.newCondition();

        Condition bCondition = lock.newCondition();

        ThreadA threadA = new ThreadA(lock,aCondition);
        ThreadB threadB = new ThreadB(lock,bCondition);
        ThreadC threadC = new ThreadC(lock,bCondition);

        new Thread(threadA).start();
        new Thread(threadB).start();
        new Thread(threadC).start();

        System.out.println("main");
        Thread thread = Thread.currentThread();
        try {
            thread.join(3);
        } catch (InterruptedException e) {


        }
    }
}
