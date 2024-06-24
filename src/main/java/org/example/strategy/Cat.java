package org.example.strategy;

/**
 * Comparable 比较,内部比较
 * @author ZhaoJie
 * @date 2024/6/24 14:58
 */
public class Cat implements Comparable {
    int height;
    int weight;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
