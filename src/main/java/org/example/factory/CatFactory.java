package org.example.factory;

/**
 * @author ZhaoJie
 * @date 2024/6/24 14:53
 */
public class CatFactory extends AbstractFactory{
    @Override
    void createEat() {
        System.out.println("猫的吃");
    }

    @Override
    void createFood() {
        System.out.println("猫的走");
    }
}
