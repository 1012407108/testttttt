package test;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(System.currentTimeMillis());
        System.out.println(d1);
        Date d2  = new Date(System.currentTimeMillis());
        System.out.println(d2);
    }
}
