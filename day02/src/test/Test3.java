package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        LocalDate a = LocalDate.now();
        LocalTime b = LocalTime.now();
        LocalDateTime c = LocalDateTime.now();
        System.out.println("请输入年月日:");
        Scanner sc = new Scanner(System.in);
        String g = sc.nextLine();
        SimpleDateFormat h = new SimpleDateFormat("yyyy年MM月dd日");
        Date d = h.parse(g);
        System.out.println(c.getHour());

        System.out.println(a.minusDays(1));
        System.out.println(c.minusHours(1));
        System.out.println(a.getDayOfMonth());
        System.out.println(a);
        System.out.println(a.withYear(1998));
        System.out.println(a.equals(d));
    }
}
