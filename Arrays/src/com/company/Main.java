package com.company;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[5] = 50;
        int[] myIntArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] myforArr = new int[25];

        for (int i = 0; i < myforArr.length; i++) {
            myforArr[i] = i;
        }
        printArr(myforArr);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " value is " + arr[i]);
        }
    }
}
