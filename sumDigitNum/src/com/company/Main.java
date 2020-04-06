package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Total sum = " + sumDigit(125));
        System.out.println("Total sum = " + sumDigit(-125));

        System.out.println("Total sum_2 =  "+ sumDigits_2(125));
        System.out.println("Total sum_2 =  "+ sumDigits_2(-125));

    }

    public static int sumDigit(int num) {
        int total = 0;
        int hundred = 0;
        int ten = 0;
        int one = 0;
        if (num >= 10) {
            hundred = num / 100;
            ten = (num % 100) / 10;
            one = num % 10;
            total = hundred + ten + one;
            System.out.println("hundred = " + hundred + " ten = " + ten + " one = " + one);

        } else {
            return -1;
        }
        return total;
    }

    public static int sumDigits_2(int num) {
        if (num < 10) {
            return -1;
        }

        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;

            num /= 10;
        }
        return sum;
    }
}
