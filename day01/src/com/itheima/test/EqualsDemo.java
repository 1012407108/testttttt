package com.itheima.test;

import com.itheima.domain.Person;

public class EqualsDemo {
    public static void main(String[] args) {
        Person p1 = new Person("张三",15);
        Person p2 = new Person("张三",15);
        System.out.println(p1.equals(p2));
    }
}
