package com.itheima.son;

import com.itheima.domain.Person;

public class Student extends Person {
    private double score;
    public Student() {
    }

    public Student(String name, int age,double score) {
        super(name, age);
        this.score = score;
    }
    public void study(){
        System.out.println(getName()+super.getAge()+score);
    }
}
