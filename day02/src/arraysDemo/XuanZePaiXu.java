package arraysDemo;

import java.util.Arrays;

public class XuanZePaiXu {
    public static void main(String[] args) {
        int[] a = {44,22,33,11,55};
        int t = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
