package cn.test.demo;

import java.util.Random;

public class SortTest {

    public static void main(String[] args) {
        int[] sort = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            sort[i] = random.nextInt(100);
        }
        System.out.print("排序前:");
        for (int i : sort) {
            System.out.print(i + " ");
        }
        //insertSort(sort);
        //selectSort(sort);
        //bubbleSort(sort);
        quickSort(sort, 0, 9);
        System.out.print("\n排序后:");
        for (int i : sort) {
            System.out.print(i + " ");
        }
    }

    public static void insertSort(int[] sort) {
        int index;
        int temp;
        for (int i = 0; i < sort.length - 1; i++) {
            index = i;
            temp = sort[i + 1];
            while (index >= 0 && sort[index] > temp) {
                sort[index + 1] = sort[index];
                index--;
            }
            sort[index + 1] = temp;
        }
    }

    public static void selectSort(int[] sort) {
        int small;
        int temp;
        for (int i = 0; i < sort.length - 1; i++) {
            small = i;
            for (int j = i + 1; j < sort.length; j++) {
                if (sort[j] < sort[small]) {
                    small = j;
                }
            }
            if (small != i) {
                temp = sort[i];
                sort[i] = sort[small];
                sort[small] = temp;
            }
        }
    }

    public static void bubbleSort(int[] sort) {
        int flag = 1;
        int temp;
        for (int i = 0; i < sort.length - 1 && flag == 1; i++) {
            flag = 0;
            for (int j = 0; j < sort.length - 1 - i; j++) {
                if (sort[j] > sort[j + 1]) {
                    flag = 1;
                    temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }

        }
    }

    public static void quickSort(int[] sort, int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int temp = sort[i];
            while (i < j) {
                while (i < j && sort[j] > temp) {
                    j--;
                }
                if (i < j) {
                    sort[i] = sort[j];
                    i++;
                }
                while (i < j && sort[i] < temp) {
                    i++;
                }
                if (i < j) {
                    sort[j] = sort[i];
                    j--;
                }
            }
            sort[i] = temp;
            quickSort(sort, left, i - 1);
            quickSort(sort, i + 1, right);
        }
    }

}
