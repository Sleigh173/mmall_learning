package com.mmall.test;

import org.junit.Test;

import java.math.BigDecimal;

public class BigDecimalTest {
    @Test
    public void test1() {
        System.out.println(0.05 + 0.01);
        System.out.println(1.0 - 0.42);
        System.out.println(4.015 * 100);
        System.out.println(123.3 / 100);
        //结果和想象有点出入，浮点型数据计算丢失精度
//        0.060000000000000005
//        0.5800000000000001
//        401.49999999999994
//        1.2329999999999999
        //所以价格计算就会出问题
    }
    @Test
    public void test2() {
        BigDecimal b1 = new BigDecimal(0.05);
        BigDecimal b2 = new BigDecimal(0.01);
        System.out.println(b1.add(b2));
        //结果是0.06000000000000000298372437868010820238851010799407958984375
        //为什么没解决丢失精度问题？
    }
    @Test
    public void test3() {
        BigDecimal b1 = new BigDecimal("0.05");
        BigDecimal b2 = new BigDecimal("0.01");
        System.out.println(b1.add(b2));
        //0.06正确
        //所以我们在用BigDecimal的时候一定要用String的构造器
    }
}
