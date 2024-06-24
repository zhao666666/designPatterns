package org.example.singleton;

/**
 * 枚举实现单例模式-防止序列号
 * @author ZhaoJie
 * @date 2024/6/24 10:06
 */
public enum DemoSingleton04 {
    INSTANCE;

    public static void main(String[] args) {
        DemoSingleton04 demo1 = DemoSingleton04.INSTANCE;
        DemoSingleton04 demo2 = DemoSingleton04.INSTANCE;
        System.out.println(demo1.hashCode() == demo2.hashCode() ? "ture" : "false");
    }

}
