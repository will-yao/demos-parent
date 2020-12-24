package dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/12/11
 **/
public class Test {

//    public static void main(String[] args) {
//        try{
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
//                    new File("Customer.txt")));
//
//            Object o = ois.readObject();
//
//            Class<?> aClass = Class.forName("com.alibaba.demo.ExtBaseRequest1.java");
//
//
//            JSONObject.parseObject("{}",aClass.getClass());
//        }catch (Exception e){
//
//        }
//
//    }

    public static void main(String[] args) {
        //要代理的真实对象
        People people = new Teacher();
        //代理对象的调用处理程序，我们将要代理的真实对象传入代理对象的调用处理的构造函数中，最终代理对象的调用处理程序会调用真实对象的方法
        WorkHandler handler = new WorkHandler(people);
        /**
         * 通过Proxy类的newProxyInstance方法创建代理对象，我们来看下方法中的参数
         * 第一个参数：people.getClass().getClassLoader()，使用handler对象的classloader对象来加载我们的代理对象
         * 第二个参数：people.getClass().getInterfaces()，这里为代理类提供的接口是真实对象实现的接口，这样代理对象就能像真实对象一样调用接口中的所有方法
         * 第三个参数：handler，我们将代理对象关联到上面的InvocationHandler对象上
         */
        People proxy = (People) Proxy.newProxyInstance(handler.getClass().getClassLoader(), people.getClass().getInterfaces(), handler);
        //System.out.println(proxy.toString());
        //handler.exec();
        proxy.work(1);
        proxy.eat("1");
    }

}
