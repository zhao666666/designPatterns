package org.example.factory;

/**
 * @author ZhaoJie
 * @date 2024/6/24 14:54
 */
public class DogFactory extends AbstractFactory{

    @Override
    void createEat() {
        System.out.println("狗的吃");
    }

    @Override
    void createFood() {
        System.out.println("狗的走");
    }
}
