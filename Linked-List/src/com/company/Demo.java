package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("London");
//        placesToVisit.add("Paris");
//        placesToVisit.add("New York");
//        placesToVisit.add("Sidney");
//        placesToVisit.add("Berlin");
//        placesToVisit.add("Rome");
//        placesToVisit.add("Moscow");
//        printList(placesToVisit);
//        placesToVisit.add(2,"Las Vegas");
//        printList(placesToVisit);
//        placesToVisit.remove(3);
//        printList(placesToVisit);


        addInOrder(placesToVisit,"London" );
        addInOrder(placesToVisit,"Paris" );
        addInOrder(placesToVisit,"New York");
        addInOrder(placesToVisit,"Sidney" );
        addInOrder(placesToVisit,"Berlin" );
        addInOrder(placesToVisit,"Rome" );
        addInOrder(placesToVisit,"Moscow");

        printList(placesToVisit);

        addInOrder(placesToVisit,"Tokyo");
        addInOrder(placesToVisit,"London");
        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting "+ i.next());
        }
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }

    private static boolean addInOrder(LinkedList<String> linkedList , String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison ==0){
                System.out.println("City "+ newCity+" already exists");
                return false;
            }else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison <0){

            }
        }
        stringListIterator.add(newCity);
        return true;
    }


    private static void visit (LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities available");
            return;
        }else{
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Trip over");
                    quit =true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting "+ listIterator.next());
                    }else{
                        System.out.println("Reached end of list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.hasPrevious();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+ listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                    case 3:
                        printMenu();
                        break;

            }
        }
    }

    private static void printMenu(){
        System.out.println("Actions menu");
        System.out.println("0 --> QUIT");
        System.out.println("1 --> NEXT CITY");
        System.out.println("2 --> PREVIOUS CITY");
        System.out.println("3 --> MENU");

    }



}
