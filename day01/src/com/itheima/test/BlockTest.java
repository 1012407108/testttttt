package com.itheima.test;



public class BlockTest {
    public static void main(String[] args) {
        {
            System.out.println("代码块");
        }
        Student s1  = new Student();
        Student s2  =  new Student(1);

    }
}

class  Student{

    //静态代码块,字节码文件只加载一次,所以这个静态代码块只加载一次(随着类的加载而执行)
    static String  school;
    static{
        school = "黑马程序员";
        System.out.println("构造类Student的静态代码块");
    }
    {
        System.out.println("Student的构造代码块");
        System.out.println("好好学习");
    }
    public Student(){
        System.out.println("空参构造方法");
    }
    public Student(int i){
        System.out.println("代餐构造方法");
    }

}