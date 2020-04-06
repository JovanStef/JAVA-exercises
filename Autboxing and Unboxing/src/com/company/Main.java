package com.company;

public class Main {

    public static void main(String[] args) {
        Bank myBank = new Bank("myBank");

        myBank.addBranch("myBranch_1");
        myBank.addBranch("myBranch_2");

        myBank.addCustomer("myBranch_1", "Customer_1", 20.20);
        myBank.addCustomer("myBranch_1", "Customer_2", 40.40);
        myBank.addCustomer("myBranch_1", "Customer_3", 30.30);

        myBank.addCustomer("myBranch_2", "Customer_1", 70.12);
        myBank.addCustomer("myBranch_2", "Customer_2", 55.55);
        myBank.addCustomer("myBranch_2", "Customer_3", 60.10);

        myBank.listCustomers("myBranch_1", true);
        myBank.listCustomers("myBranch_2", true);


    }
}
