package com.company;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super("Deluxe", "Sousage & Bacon", 100, "White");
        super.addHamburgerAdd_1("Chips" , 20);
        super.addHamburgerAdd_2("Drink" , 20);
    }

    @Override
    public void addHamburgerAdd_1(String name, int price) {
        System.out.println("No additions allowed");
    }

    @Override
    public void addHamburgerAdd_2(String name, int price) {
        System.out.println("No additions allowed");
    }

    @Override
    public void addHamburgerAdd_3(String name, int price) {
        System.out.println("No additions allowed");
    }

    @Override
    public void addHamburgerAdd_4(String name, int price) {
        System.out.println("No additions allowed");
    }
}
