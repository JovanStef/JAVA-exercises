package com.company.Scope;

public class Main {

    public static void main(String[] args) {
	Account myAccount = new Account("myAccount");
	myAccount.deposit(5000);
	myAccount.withdraw(2500);
	myAccount.deposit(-500);
	myAccount.withdraw(-2000);
	myAccount.calculateBalance();

        System.out.println("Balance on account is "+ myAccount.getBalance());
    }
}
