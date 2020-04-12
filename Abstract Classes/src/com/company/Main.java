package com.company;

public class Main {

    public static void main(String[] args) {
	Dog dog = new Dog("Dog");
	dog.breathe();
	dog.eat();

	Parrot parrot = new Parrot("Weird bird");
	parrot.breathe();
	parrot.eat();
	parrot.fly();

	Penguin penguin = new Penguin("Penguin");
	penguin.fly();



    }
}
