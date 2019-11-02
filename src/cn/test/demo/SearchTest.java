package cn.test.demo;

import java.util.Scanner;

public class SearchTest {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入想要查找的数：");
        int num = scan.nextInt();
//        int result = sequelSearch(a, num);
        int result = binarySearch(a, num);
        if(result == -1){
            System.out.println("你输入的数不存在与数组中。");
        } else {
            System.out.println("你输入的数字存在，在数组中的位置是:第"+(result+1)+"个");
        }
    }

    public static int sequelSearch(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a, int num) {
        int low = 0;
        int high = a.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (num == a[mid]) {
                return mid;
            } else if (num > a[mid]) {
                low = mid + 1;
            } else if (num < a[mid]) {
                high = mid -1;
            }
        }
        return -1;
    }

}
