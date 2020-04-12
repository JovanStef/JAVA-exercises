package com.company;

public class Main {

    public static void main(String[] args) {
	MyLinkedList list = new MyLinkedList(null);
	list.traverse(list.getRoot());

	String stringData = "Eni Meni Seni Peni Meni Deni Keni";
	String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());






    }
}
