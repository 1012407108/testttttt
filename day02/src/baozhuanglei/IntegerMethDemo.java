package baozhuanglei;

public class IntegerMethDemo {
    public static void main(String[] args) {
        int a = 100;
        String s = Integer.toBinaryString(a);
        System.out.println(s);
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));
        String s1 = "123";
        System.out.println(s1+100);
        System.out.println(Integer.parseInt(s1)+110);

    }
}
