package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Numbers " + sum(1000));
    };

    public static int sum(int num) {
        int count = 0;
        int total = 0;
        for (int i = 1; i <= num; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                total += i;
                System.out.println(i);
            }
            if (count == 5) {
                break;
            }
        }
        return total;
    }
}
