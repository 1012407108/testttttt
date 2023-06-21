package com.itheima.son;

import com.itheima.domain.Employee;

public class Manager extends Employee {

    private double gett;
    public Manager() {
    }

    public Manager(String name, int age, double salary,double gett) {
        super(name, age, salary);
        this.gett = gett;
    }

    @Override
    public void work() {
        System.out.println("姓名为:"+super.getName()+",年龄为"+super.getAge()+",工资为"+super.getSalary()+"奖金为"+gett+"的项目经理正在分配任务...");

    }
}
