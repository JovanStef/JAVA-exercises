package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	int[]myArr = getIntegers(5);
	printArr(myArr);
	int [] sortedArr = sortArr(myArr);
	printArr(sortedArr);
    }

    public static int[] getIntegers(int number){
        int[] arr = new int [number];
        System.out.println("Please enter "+number+" numbers!\r");
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArr(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value for number "+i+" is "+arr[i]);
        }
    }
    public static int[]sortArr(int[]arr){
//      int [] sortedArr = new int[arr.length];
//        for (int i = 0; i <arr.length ; i++) {
//    sortedArr[i] = arr[i];
//        }

        int[] sortedArr = Arrays.copyOf(arr , arr.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i <sortedArr.length -1; i++) {
                if(sortedArr[i]<sortedArr[i+1]){
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    flag =true;
                }
            }
        }
        return  sortedArr;
    }
}
