package baozhuanglei;

public class IntegerDemo {
    public static void main(String[] args) {
        int num = 10;
        Integer i1 = Integer.valueOf(num);
        System.out.println(i1);
        int i = i1.intValue();
        System.out.println(i);
        System.out.println(i == i1);
    }
}
