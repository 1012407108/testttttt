package com.itheima.son;

import com.itheima.domain.Person;

public class Teacher extends Person {
    @Override
    public void abilith() {
        teacher();
    }

    private void teacher() {
        super.setName("张三");
        super.setAge(30);
        System.out.println("姓名为:" + super.getName() + ",年龄为:" + super.getAge() + "岁的老师正在讲课");
    }
}
