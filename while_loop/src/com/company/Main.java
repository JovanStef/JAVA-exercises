package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 4;
        int endNum = 50;
        int count = 0;

        while (num <= endNum) {
            num++;
            if (!isEvenNumber(num)) {
                continue;
            }

            count++;
            System.out.println("Even number " + num);
            if (count == 5) {
                System.out.println("Number of numbers " + count);
                break;
            }
            ;

        }

    }

    ;

    public static boolean isEvenNumber(int num) {
        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }
}
