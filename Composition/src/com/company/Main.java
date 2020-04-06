package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	Case theCase = new Case("2300", "Dell", "240", dimensions);

	Monitor theMonitor = new Monitor("Big Monitor" , "Acer", 27 , new Resolution(2540,1440));

	Motherboard theMotherboard = new Motherboard("D2-156", "ASUS" , 4,5,"v2.44");

	PC thePC = new PC(theCase,theMonitor,theMotherboard);

	thePC.powerUp();
    }
}
