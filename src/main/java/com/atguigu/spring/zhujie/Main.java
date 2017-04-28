package com.atguigu.spring.zhujie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lance017 on 2017/4/27.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-zhujie.xml");

//        TestObject object = (TestObject) context.getBean("testObject");
//        System.out.println(object);

        UserController controller = (UserController) context.getBean("userController");
        System.out.println(controller);
        controller.execute();

        UserRepositoryImpl repository = (UserRepositoryImpl) context.getBean("userRepositoryImpl");
        System.out.println(repository);

        UserService service = (UserService) context.getBean("userService");
        System.out.println(service);

    }
}
