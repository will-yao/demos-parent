package com.xuantuo.concurrent.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/12/23
 **/
public class ThreadA implements Runnable{


    private Lock lock;

    Condition aCondition;

    public ThreadA(Lock lock, Condition aCondition) {
        this.lock = lock;
        this.aCondition = aCondition;
    }

    @Override
    public void run() {

        lock.lock();

        try {
            aCondition.await(); //此时当前线程释放lock锁，进入[等待状态]，等待其他线程执行aCondition.signal()时才有可能执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----A");

        lock.unlock();

    }
}
