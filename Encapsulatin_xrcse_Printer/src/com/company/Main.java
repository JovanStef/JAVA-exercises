package com.company;

public class Main {

    public static void main(String[] args) {
	Printer epson = new Printer(70,true);
	epson.printPages(100);
		System.out.println("Toner lvl: " + epson.getTonerLvl());

    }
}
