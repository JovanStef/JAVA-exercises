package com.company;

public class Main {

    public static void main(String[] args) {
        String [] anArr = new String[]{"One", "Two", "Tree", "Four", "Five"};
        System.out.println(anArr);
	printArray(anArr);
    }
    public static void printArray(String[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.println("number "+i+" : "+ arr[i]);
        }
    }
}
