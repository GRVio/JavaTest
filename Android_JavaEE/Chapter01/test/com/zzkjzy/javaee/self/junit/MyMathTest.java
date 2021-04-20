package com.zzkjzy.javaee.self.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 测试类
 * JUnit工具，用于单元测试
 * 在工程目录下新建一个test包，并右键Make Directory as。。Test Sources Root
 * 之后在需要测试的类中，在类名上按Ctrl+Shift+T，创建测试类即可
 */
public class MyMathTest {

    @Test
    public void add() {
        // 进行测试
        MyMath mm = new MyMath();
        int result = mm.add(1, 2);
        // 调用方法，传入期望值和实际返回值
        assertEquals(3,result);
    }

    @Test
    public void minus() {
        MyMath mm = new MyMath();
        int result = mm.minus(3, 1);
        assertEquals(2,result);
    }
}