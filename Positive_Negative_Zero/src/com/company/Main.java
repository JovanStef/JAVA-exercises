package com.company;

public class Main {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);

    }
        public static void checkNumber(int number){
            if(number>0){
                System.out.println("Positive " + number);
            }else if(number < 0){
                System.out.println("Negative " + number);
            }else if(number == 0){
                System.out.println("Zero "+ number);
            }
    }

}
