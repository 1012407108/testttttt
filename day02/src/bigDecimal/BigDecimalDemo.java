package bigDecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        System.out.println(bd1.add(bd2));

        BigDecimal bd3 = BigDecimal.valueOf(0.1);
        BigDecimal bd4 = BigDecimal.valueOf(0.2);
        System.out.println(bd3.add(bd4));
    }
}
