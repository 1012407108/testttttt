package com.itheima.test;

import com.itheima.son.Student;
import com.itheima.son.Teacher;

public class PersonTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.abilith();
        Student s = new Student("张三",52,95.5);
        s.study();
    }

}
