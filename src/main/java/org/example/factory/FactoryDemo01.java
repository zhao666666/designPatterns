package org.example.factory;

/**
 * 工程模式-形容词用接口,名称用抽象类
 * @author ZhaoJie
 * @date 2024/6/24 14:40
 */
public class FactoryDemo01 {
    public static void main(String[] args) {
        AbstractFactory factory1 = new CatFactory();
        AbstractFactory factory2 = new DogFactory();
        factory1.createEat();
        factory1.createFood();

        factory2.createFood();
        factory2.createFood();
    }
}
