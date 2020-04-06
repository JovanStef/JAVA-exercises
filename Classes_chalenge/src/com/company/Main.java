package com.company;

public class Main {

    public static void main(String[] args) {
	Account myAcc = new Account(123456, 5000, "Me","mail@mail.com", "555-555");
	myAcc.withdraw(10);

	myAcc.deposit(100);
	myAcc.withdraw(800);

	myAcc.deposit(2000);
	myAcc.withdraw(500);


	VipCustomer person_1 = new VipCustomer();
		System.out.println(person_1.getName());

		VipCustomer person_2 = new VipCustomer("Name_2","mail_2@mail.com");
		System.out.println(person_2.getName());

		VipCustomer person_3 = new VipCustomer("Name_3",5000, "mail_3@mail.com");
		System.out.println(person_3.getName());
		System.out.println(person_3.getEmail());
    }
}
