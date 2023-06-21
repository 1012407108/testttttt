package com.itheima.interfacee;

public interface Minterface {
    public abstract void show();
    public abstract void fuccc();
    public default void save(){
        System.out.println("我是jdk8新特性,我可以做到default默认,public可以省略");
    }
    public static void mStatic(){
        System.out.println("我是static特性,可以写明方法");
        gongTong();
    }
     static void gongTong(){
        System.out.println("dddd");
    }
}
