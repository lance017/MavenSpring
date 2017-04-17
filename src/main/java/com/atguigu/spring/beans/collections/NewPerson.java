package com.atguigu.spring.beans.collections;

import com.atguigu.spring.beans.Car;

import java.util.Map;

/**
 * Created by lance017 on 2017/4/17.
 */
public class NewPerson {

    private String name;

    private int age;

    private Map<String, Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    public NewPerson() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
