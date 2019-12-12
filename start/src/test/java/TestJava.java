import java.util.List;
import java.util.Optional;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/26
 **/
public class TestJava {


    public static void main(String[] args) {
        String s =  "支付宝账号为123456";

//        AtomicLong atomicLong = new AtomicLong();
//        long l = atomicLong.addAndGet(1);
//        System.out.println(l);
//        System.out.println(atomicLong.addAndGet(1));
        List<String> ls2 = null;

        ls2.stream().forEach(s1 -> {
            System.out.println(s);
        });

        Optional<List<String>> s21 = Optional.ofNullable(ls2);

        //System.out.println(s21);


    }
}
