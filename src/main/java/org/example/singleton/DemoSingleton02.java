package org.example.singleton;

/**
 * 双重检查=基于懒汉式加载,并且解决并发问题
 * @author ZhaoJie
 * @date 2024/6/24 9:58
 */
public class DemoSingleton02 {
    //不能用final修饰
    private static volatile DemoSingleton02 INSTANCE;

    private DemoSingleton02(){}

    public static DemoSingleton02 getInstance(){
        if(INSTANCE == null){
            synchronized (DemoSingleton02.class){
                if (INSTANCE == null){
                    INSTANCE = new DemoSingleton02();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        DemoSingleton02 demo1 = DemoSingleton02.getInstance();
        DemoSingleton02 demo2 = DemoSingleton02.getInstance();
        System.out.println(demo1.hashCode() == demo2.hashCode() ? "ture" : "false");
    }

}
