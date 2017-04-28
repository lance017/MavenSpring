package com.atguigu.spring.fanxing;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lance017 on 2017/4/28.
 */
public class BaseService<T> {

    @Autowired(required = false)
    protected BaseResponsitory<T> responsitory;

    public void add() {
        System.out.println("add...");
        System.out.println(responsitory);
    }
}
