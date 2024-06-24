package org.example.singleton;

/**
 * 静态内部类实现-static唯一
 * @author ZhaoJie
 * @date 2024/6/24 10:01
 */
public class DemoSingleton03 {
    static class SingletonHolder{
        static final DemoSingleton03 INSTANCE = new DemoSingleton03();
    }

    public static DemoSingleton03 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        DemoSingleton03 demo1 = DemoSingleton03.getInstance();
        DemoSingleton03 demo2 = DemoSingleton03.getInstance();
        System.out.println(demo1.hashCode() == demo2.hashCode() ? "ture" : "false");
    }

}
