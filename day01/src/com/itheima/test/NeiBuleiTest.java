package com.itheima.test;

public class NeiBuleiTest {
    public static void main(String[] args) {
        dddddd(new ddd() {
            @Override
            public void sub() {
                System.out.println("ddddddddddd");
            }
        });

        System.out.println("------------");
        dddddd(() ->  System.out.println("ddddddddddd"));
    }

    public static void dddddd(ddd d){
        d.sub();
    }
}
interface  ddd{
    void sub();
}
