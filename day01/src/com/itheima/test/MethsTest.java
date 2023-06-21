package com.itheima.test;

import com.itheima.tools.ArrayTool;

public class MethsTest {
    public static void main(String[] args) {
        int[] a = {11,22,33,44,55,66,77};
        int max = ArrayTool.getMax(a);
        System.out.println(max);
        int min = ArrayTool.getMin(a);
        System.out.println(min
        );

    }

}
