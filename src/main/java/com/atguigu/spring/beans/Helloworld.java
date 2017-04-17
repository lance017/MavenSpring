package com.atguigu.spring.beans;

/**
 * Created by lance017 on 2017/4/14.
 */
public class Helloworld {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("hello   " + name);
    }

    public Helloworld() {

    }
}
