package com.itheima.domain;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof Person){
//        Person per = (Person) obj;
//        return this.age == per.age && this.name.equals(per.name);
//        }
//        else{
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }



    public void abilith() {
        System.out.println("能力范畴:???");
    }

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

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
