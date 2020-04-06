package com.company;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	int [] myArr = readNumbers(5);
	int minNumber = minNum(myArr);
        System.out.println("Min nuber is "+ minNumber);
    }
     public static int[] readNumbers(int num){
        int []arr = new int [num];
         System.out.println("Please enter "+num+" numbers!");
         for (int i = 0; i < arr.length; i++) {
             arr[i] = scanner.nextInt();
         }
         return arr;
     }
     public static int minNum(int[]arr){
        int min = arr[0];
         for (int i = 0; i <arr.length; i++) {
             if(arr[i]<min){
                 min = arr[i];
             }
         }
         return min;
     }
}
