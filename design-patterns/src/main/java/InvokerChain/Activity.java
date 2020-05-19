package InvokerChain;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/5/19
 **/
public class Activity {

    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(0);

        try {
            InvokerChain.instance()
                    .addInstruction(() -> print(atomicLong))
                    .addInstruction(() -> print2(atomicLong))
                    .addInstruction(() -> print3(atomicLong))
                    .run();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static void print(AtomicLong atomicLong) {
        System.out.println(atomicLong.addAndGet(1));
    }


    private static void print2(AtomicLong atomicLong) {
        System.out.println(atomicLong.addAndGet(5));
    }

    private static void print3(AtomicLong atomicLong) {
        System.out.println(atomicLong.addAndGet(10));
    }
}
