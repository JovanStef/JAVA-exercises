package com.company;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int total = 0;

        while (counter<10){
            System.out.println("Please enter number #"+(counter+1));
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int num = scanner.nextInt();
                total+=num;
                counter ++;
            }else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Total: "+ total);
        scanner.close();
    }


}
