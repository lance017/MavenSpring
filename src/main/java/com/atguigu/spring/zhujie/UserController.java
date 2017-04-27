package com.atguigu.spring.zhujie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by lance017 on 2017/4/27.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void execute() {
        System.out.println("UserController execute...");
        userService.add();
    }

}
