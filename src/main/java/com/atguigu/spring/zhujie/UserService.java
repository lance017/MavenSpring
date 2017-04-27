package com.atguigu.spring.zhujie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by lance017 on 2017/4/27.
 */
@Service
public class UserService {
    @Autowired
    @Qualifier("userRepositoryImpl")
    private UserRepository userRepository;
    public void add() {
        System.out.println("UserService add...");
        userRepository.save();
    }
}
