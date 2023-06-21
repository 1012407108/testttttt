package test;

public class StringTest {
    public static void main(String[] args) {
        String s = "10,50,30,20,40";
        //根据逗号做切割
        String[] split = s.split(",");
        //每一个都转换以下
        int[] a = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            a[i] = Integer.parseInt(split[i]);
        }

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max)max = a[i];

        }
        System.out.println(max);
    }
}
