package com.atguigu.spring.zhujie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by lance017 on 2017/4/27.
 */
@Repository
public class UserRepositoryImpl implements UserRepository{

    @Autowired(required = false)
    private TestObject testObject;

    public void save() {
        System.out.println("UserRepository Save...");
        System.out.println("testObject = " + testObject);
    }
}
