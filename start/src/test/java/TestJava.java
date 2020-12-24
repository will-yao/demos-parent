import org.assertj.core.util.Lists;

import java.util.*;

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


        Map<String, List<String>> result = new TreeMap<>();

        result.put("支付类", new LinkedList<String>(){{
            add("支付1");
            add("支付2");
        }});
        result.put("店铺类", new LinkedList<String>(){{
            add("店铺1");
            add("店铺2");
        }});
        result.put("交易类", new LinkedList<String>(){{
            add("交易1");
            add("交易2");
        }});
        result.put("营销类", new LinkedList<String>(){{
            add("营销1");
            add("营销2");
        }});
        result.put("商品类", new LinkedList<String>(){{
            add("商品1");
            add("商品2");
        }});

        //return result;


    }
}
