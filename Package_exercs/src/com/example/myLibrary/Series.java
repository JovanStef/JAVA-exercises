package com.example.myLibrary;

public class Series {

    public static long nSum(int n){
        return (n*(n+1))/2;
    }

    public static long factorial(int n){
        if(n==0){
            return 0;
        }
        long fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact *=i;
        }
        return fact;
    }

    public static long fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        long nMinus_1 = 1;
        long nMinus_2 = 0;
        long fib = 0;
        for (int i = 1; i <n ; i++) {
            fib = (nMinus_1+nMinus_2);
            nMinus_2 = nMinus_1;
            nMinus_1 = fib;
        }
        return fib;
    }

}
