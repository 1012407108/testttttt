package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class IntervalTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate tomorrow = LocalDate.of(2023, 2, 4);
        System.out.println(tomorrow);


        Period between = Period.between(tomorrow, today);
        System.out.println(between.getMonths());
    }
}
