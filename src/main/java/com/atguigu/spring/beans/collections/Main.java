package com.atguigu.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lance017 on 2017/4/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) context.getBean("person3");

        System.out.println(person);

        NewPerson newPerson = (NewPerson) context.getBean("newPerson");
        System.out.println(newPerson);

        DataSource source = (DataSource) context.getBean("dataSource");
        System.out.println(source);

    }
}
