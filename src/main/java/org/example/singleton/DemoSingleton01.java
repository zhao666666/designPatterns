package org.example.singleton;

/**
 * 单例模式-饿汉式加载
 * @author ZhaoJie
 * @date 2024/6/24 9:56
 */
public class DemoSingleton01 {
    private static final DemoSingleton01 INSTANCE = new DemoSingleton01();

    /**
     * 构造私有化
     */
    private DemoSingleton01(){}

    public static DemoSingleton01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        DemoSingleton01 demo1 = DemoSingleton01.getInstance();
        DemoSingleton01 demo2 = DemoSingleton01.getInstance();
        System.out.println(demo1.hashCode() == demo2.hashCode() ? "ture" : "false");
    }
}
