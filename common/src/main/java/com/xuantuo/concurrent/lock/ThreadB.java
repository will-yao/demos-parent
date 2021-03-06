package com.xuantuo.concurrent.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/12/23
 **/
public class ThreadB implements Runnable{


    private Lock lock;

    Condition bCondition;

    public ThreadB(Lock lock, Condition bCondition) {
        this.lock = lock;
        this.bCondition = bCondition;
    }

    @Override
    public void run() {

        lock.lock();

        try {
            bCondition.await(); //此时当前线程释放lock锁，进入[等待状态]，等待其他线程执行aCondition.signal()时才有可能执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----B");

        lock.unlock();

    }
}
