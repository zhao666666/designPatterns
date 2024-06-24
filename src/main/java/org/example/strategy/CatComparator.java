package org.example.strategy;

import java.util.Comparator;

/**
 * 策略模式-比较器,外部毕竟
 * @author ZhaoJie
 * @date 2024/6/24 14:40
 */
public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.height < o2.height) return -1;
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
