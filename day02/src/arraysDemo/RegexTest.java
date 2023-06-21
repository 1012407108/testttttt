package arraysDemo;

public class RegexTest {
    public static void main(String[] args) {
        //QQ
        String qq = "[^0]\\d{4,11}";
        System.out.println("1012407108".matches(qq));
        System.out.println("----------------");
        //手机
        String shouJi = "[1][3-9]\\d{9}";
        System.out.println("17708205319".matches(shouJi));
        System.out.println("--------------------");
        //邮箱1012407108@qq.com
        String youXiang = "\\w{1,15}[@][\\w && [^_]]{1,10}(\\.[a-z]{2,5})+";
        System.out.println("1012407108@qq.com.com".matches(youXiang));
    }
}
