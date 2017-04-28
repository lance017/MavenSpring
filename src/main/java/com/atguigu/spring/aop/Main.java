package com.atguigu.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lance017 on 2017/4/28.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        ArithmeticCalculator calculator = (ArithmeticCalculator) context.getBean("arithmeticCalculatorImpl");
        int result =  calculator.add(3, 6);
        System.out.println("result:" + result);

        result = calculator.div(4, 2);
        System.out.println("result:" + result);
    }
}
