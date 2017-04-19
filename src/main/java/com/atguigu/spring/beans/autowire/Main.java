package com.atguigu.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lance017 on 2017/4/19.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowire.xml");
        Car car = (Car) context.getBean("car");
        Car car2 = (Car) context.getBean("car");
        System.out.println(car2 == car);
    }
}
