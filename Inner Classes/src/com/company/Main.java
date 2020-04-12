package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//        Gearbox fiat = new Gearbox(6);
//
//        fiat.operateClitch(true);
//        fiat.changeGear(1);
//        fiat.operateClitch(false);
//        System.out.println(fiat.wheelSpeed(1000));
//        fiat.changeGear(2);
//        System.out.println(fiat.wheelSpeed(2000));
//        fiat.operateClitch(true);
//        fiat.changeGear(3);
//        fiat.operateClitch(false);
//        System.out.println(fiat.wheelSpeed(3000));

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("click attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");

            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
