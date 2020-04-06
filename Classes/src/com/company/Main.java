package com.company;

public class Main {

    public static void main(String[] args) {
	Car lada = new Car();
	Car buhanka = new Car();

	lada.setModel("TRT");

        System.out.println("Model is: "+ lada.getModel());
    }
}
