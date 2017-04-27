package com.atguigu.spring.zhujie;

import org.springframework.stereotype.Repository;

/**
 * Created by lance017 on 2017/4/27.
 */
@Repository
public class UserJdbcRepository implements UserRepository {

    public void save() {
        System.out.println("UserJdbcRepository save...");
    }
}
