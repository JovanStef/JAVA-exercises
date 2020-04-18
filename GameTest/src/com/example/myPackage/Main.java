package com.example.myPackage;

import com.example.game.ISavable;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Player john = new Player("John", 100 , 15);
        System.out.println(john.toString());
        saveObject(john);

        john.setHitPoints(80);
        System.out.println(john);
        john.setWeapon("crowbar");
        saveObject(john);
        loadObject(john);
        System.out.println(john);
    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose");
        System.out.println("1 to enter a string");
        System.out.println("0 to quit");

        while(!quit){
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index , stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

public static void saveObject(ISavable objectToSave){
    for (int i = 0; i <objectToSave.write().size() ; i++) {
        System.out.println("Saving "+objectToSave.write().get(i));
    }
}

    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }





}
