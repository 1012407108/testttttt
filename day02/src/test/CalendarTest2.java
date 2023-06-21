package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String dataContent = sc.nextLine();


        //使用Sim,将日期字符转换为日期对象
        SimpleDateFormat   dateFormat  = new SimpleDateFormat("yyyy年MM月dd日");
        Date date =dateFormat.parse(dataContent);
        //将日期对象转换为Calendar对象
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        //调用get方法

        System.out.println(c.get(Calendar.DAY_OF_YEAR));

    }
}
