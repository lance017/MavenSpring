package com.atguigu.spring.dongtaiaop;

/**
 * Created by lance017 on 2017/4/28.
 */
public class Main {
    public static void main(String[] args) {
//        ArithmeticCalculator calculator = new ArithmeticCalculatorImpl();

        ArithmeticCalculator target = new ArithmeticCalculatorImpl();

        ArithmeticCalculator proxy = new  ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();

        int result = proxy.add(1,2);
        System.out.println("-->" + result);

        result = proxy.div(4, 2);
        System.out.println("-->" + result);
    }
}
