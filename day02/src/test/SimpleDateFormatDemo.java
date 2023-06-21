package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
SimpleDateFormat format = new SimpleDateFormat("yyyy年-MM月-dd日 HH:mm:ss E a");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}
