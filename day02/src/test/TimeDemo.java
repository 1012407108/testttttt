package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeDemo {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日:++++年++月++日");
        String b= sc.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");

        Date birthday = format.parse(b);
        Date today = new Date();
        long l = today.getTime() - birthday.getTime();
        System.out.println(l/1000/60/60/24);
    }
}
