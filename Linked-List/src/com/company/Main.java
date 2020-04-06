package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Customer customer = new Customer("John" , 20.20);
	Customer customer_2;

	customer_2 = customer;
	customer_2.setBalance(50.50);
        System.out.println("Balance for customer "+ customer.getName()+" is"+ customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i <intList.size() ; i++) {
            System.out.println(i+": "+intList.get(i));
        }

        intList.add(1,8);

        for (int i = 0; i <intList.size() ; i++) {
            System.out.println(i+": "+intList.get(i));
        }






    }
}
