package com.itheima.tools;

public class ArrayTool {
    private ArrayTool() {
    }

    public static int getMax(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    public static int getMin(int[] a){
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }
}
