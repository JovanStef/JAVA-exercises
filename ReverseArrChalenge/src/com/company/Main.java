package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArr = {1, 8, 3, 4, 12};
        reverseArr(myArr);
    }

    public static void reverseArr(int[] arr) {
        int[] reversedArr = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < reversedArr.length; i++) {
            reversedArr[j] = arr[i];
            j--;
        }
        System.out.println(Arrays.toString(reversedArr));
    }

    public static void reverseParallelArr(int[] arr) {
        int maxIndex = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[maxIndex - 1];
            arr[maxIndex - 1] = temp;
        }
    }
}
