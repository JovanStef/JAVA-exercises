package com.company;

public class Main {

    public static void main(String[] args) {
	ITelephone timsPhone;
	timsPhone = new DeskPhone(55555);
	timsPhone.powerOn();
	timsPhone.callPhone(55555);
	timsPhone.answer();

	timsPhone = new MobilePhone(66666);
	timsPhone.powerOn();
	timsPhone.callPhone(66666);
	timsPhone.answer();
    }
}
