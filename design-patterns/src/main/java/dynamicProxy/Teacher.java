package dynamicProxy;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/12/17
 **/
public class Teacher implements People {

    public void work(int i) {
        System.out.println("i :" + i);
    }

    public void eat(String s) {
        System.out.println("s :" + s);
    }
}
