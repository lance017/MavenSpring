package com.atguigu.spring.dongtaiaop;

/**
 * Created by lance017 on 2017/4/28.
 */
public class ArithmeticCalculatorLoggingImpl implements ArithmeticCalculator {

    public int add(int i, int j) {
        System.out.println("the mehtod add begins with["+i+","+j+"]");
        int result = i + j;
        System.out.println("the method add ends with "+result);
        return result;
    }

    public int sub(int i, int j) {
        System.out.println("the mehtod sub begins with["+i+","+j+"]");
        int result = i - j;
        System.out.println("the method sub ends with "+result);
        return result;
    }

    public int mul(int i, int j) {
        System.out.println("the mehtod mul begins with["+i+","+j+"]");
        int result = i * j;
        System.out.println("the method mul ends with "+result);
        return result;
    }

    public int div(int i, int j) {
        System.out.println("the mehtod div begins with["+i+","+j+"]");
        int result = i / j;
        System.out.println("the method div ends with "+result);
        return result;
    }
}
