package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    int [] myIntegers = getIntegers(5);
    for(int i=0;i<myIntegers.length;i++){
        System.out.println("element "+i+" has value "+myIntegers[i]);
    }

        System.out.println("Average total is "+average(myIntegers));
    }
    public static int[] getIntegers(int numbers){
        System.out.println("Enter "+ numbers+ " integer values!\r");
        int[]values= new int[numbers];

        for(int i=0;i<values.length;i++){
            values[i] =scanner.nextInt();
        }
        return values;
    }

    public static double average(int[]arr){
        double total = 0;
        for(int i =0;i<arr.length;i++){
            total+=arr[i];
        }
        return total/(double)arr.length;

    }
}
