package com.atguigu.spring.fanxing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lance017 on 2017/4/28.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-fanxing.xml");

        UserService service = (UserService) context.getBean("userService");

        service.add();
    }
}
