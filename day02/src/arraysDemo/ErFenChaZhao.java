package arraysDemo;

import java.util.Scanner;

public class ErFenChaZhao {
    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55};
        int min = 0;
        int max = a.length - 1;
        int mid = (min + max) / 2;
        System.out.println("请输入您要查找的元素x=:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (true) {
            if (max >= min) {
                if (x == a[mid]) {
                    System.out.println("查找成功,其在数组中的索引为:" + mid);
                    break;
                } else if (a[mid] > x) {
                    max = mid - 1;
                    mid = (min + max) / 2;
                } else {
                    min = mid + 1;
                    mid = (min + max) / 2;
                }
            }
            else {
                System.out.println("找不到");
                break;
            }
        }


    }
}
