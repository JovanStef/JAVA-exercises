package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic" , "Sausage" , 50, "White");
	hamburger.addHamburgerAdd_1("Tomato", 10);
        hamburger.addHamburgerAdd_2("Fries", 30);
        hamburger.addHamburgerAdd_3("Letuce", 5);
        System.out.println("Total Burger price is "+hamburger.itemizeHamburger());

    }
}
