package com.company;

class Car {
    private String name;
    private boolean engine;
    private int wheels;
    private int cylinder;

    public Car(String name, int cylinder) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinder = cylinder;
    }

    public void startEngine(){
        System.out.println("BRRRRRMMMMMMM!!!!!!");
    }
    public void accelerate(){
        System.out.println("WOOOOOOW!!!!");
    }
    public void brake(){
        System.out.println("NOOOOOOO!!!!!!");
    }
    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinder() {
        return cylinder;
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void startEngine(){
        System.out.println("Mitsubishi BRRRRMMM!!!");
    }
}

class Nissan extends Car{
    public Nissan(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void accelerate(){
        System.out.println("Nissan WOOOOOOW!!!!!");
    }
}

class Honda extends Car{
    public Honda(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void brake(){
        System.out.println("Honda NOOOOO!!!!!");
    }
}

public class Main {



    public static void main(String[] args) {
	Mitsubishi mitsubishi= new Mitsubishi("Mitsubishi",4);
	Nissan nissan = new Nissan("Nissan",6);
	Honda honda = new Honda("Honda",4);

	mitsubishi.startEngine();
	mitsubishi.accelerate();
        System.out.println("M "+ mitsubishi.getName());
        nissan.accelerate();
        System.out.println(nissan.getCylinder());
	honda.brake();
    }
}
