package callback;

import InvokerChain.InvokerChain;

import java.util.LinkedList;
import java.util.List;

public final class App {

    private App() {
    }


    public static void main(final String[] args) {
//        int i = 100;
//
//        SimpleBackTask simpleBackTask = new SimpleBackTask();
//        simpleBackTask.execute(() -> {
//            System.out.println("hehe:" + i);
//        });

        List s = new LinkedList();
        while(true){
            s.add(new InvokerChain());
        }
    }
}
