package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Testtttt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户生日:");
        String birthdat =sc.nextLine();
        LocalDate birthdayDate = LocalDate.parse(birthdat, DateTimeFormatter.ofPattern("yyyy年M月d日"));
        LocalDate now = LocalDate.now();
        //计算时间间隔
        System.out.println(ChronoUnit.YEARS.between(birthdayDate, now));

    }
}
