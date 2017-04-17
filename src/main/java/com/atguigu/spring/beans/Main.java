package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lance017 on 2017/4/14.
 */
public class Main {
    public static void main(String[] args) {
//        1.创建Spring 的IOC 容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        2.从IOC容器中获取bean实例
        Helloworld helloworld = (Helloworld) context.getBean("helloworld");
//        3.调用hello方法
        helloworld.hello();

        Car car = (Car) context.getBean("car");
        System.out.println(car);

        Car car2 = (Car) context.getBean("car2");
        System.out.println(car2);

        Person person = (Person) context.getBean("person");

        System.out.println(person);

        person = (Person) context.getBean("person1");

        System.out.println(person);

    }

}
