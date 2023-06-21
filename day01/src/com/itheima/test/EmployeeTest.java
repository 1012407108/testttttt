package com.itheima.test;

import com.itheima.son.Coder;
import com.itheima.son.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        Coder c = new Coder("张三",23,1500000);
        c.work();
        Manager m = new Manager("李四",24,1800000,5000000);
        m.work();
    }
}
