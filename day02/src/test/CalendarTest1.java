package test;

import java.util.Calendar;

public class CalendarTest1 {
    public static void main(String[] args) {
        //获取日历对象
        Calendar c = Calendar.getInstance();
        //调用set方法
        c.set(2050,2,1);
        //获取星期
        char[] weeks  ={'0','日','一','二','三','四','五','六'};
        int d = c.get(Calendar.DAY_OF_WEEK);
        if(weeks[d] == '四'){
            System.out.println("我要奢侈一把");
        }
        else{
            System.out.println("算了吧");
        }
    }
}
