package com.arguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lance017 on 2017/4/14.
 */
public class Main {
    public static void main(String[] args) {
//        Helloworld helloworld = new Helloworld();
//        helloworld.setName("atguigu");

//        1.创建Spring 的IOC 容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        2.从IOC容器中获取bean实例
        Helloworld helloworld = (Helloworld) context.getBean("helloworld");
//        3.调用hello方法
        helloworld.hello();
    }
}
