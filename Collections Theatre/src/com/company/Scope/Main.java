package com.company.Scope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Theatre theatre = new Theatre("Theatre" , 8, 12);
//	theatre.getSeats();
//        if(theatre.reserveSeat("C10")){
//            System.out.println("please pay");
//        }else{
//            System.out.println("seat taken");
//        }
//        if(theatre.reserveSeat("C10")){
//            System.out.println("please pay");
//        }else{
//            System.out.println("seat taken");
//        }
//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);
//
//        seatCopy.get(1).reserve();

        if(theatre.reserveSeat("A10")){
            System.out.println("Please pay for A10");
        }else{
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("H5")){
            System.out.println("Please pay for H5");
        }else{
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B10", 13.00));
        priceSeats.add(theatre.new Seat("c10", 13.00));
        Collections.sort(priceSeats , Theatre.PRICE_ORDER);
        printList(priceSeats);




//
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seat");
//        printList(theatre.seats);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat number is " + minSeat.getSeatNumber());
//        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Printing sorted SeatCopy");
//        printList(seatCopy);

    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.println(" " +seat.getSeatNumber() +" "+ seat.getPrice()+ "$");
        }
        System.out.println();
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }

//    public static void sortList(List<? extends Theatre.Seat> list){
//        for (int i = 0; i <list.size()-1 ; i++) {
//            for (int j = i+1; j < list.size() ; j++) {
//                if(list.get(i).compareTo(list.get(j)) > 0){
//                    Collections.swap(list,i,j);
//                }
//            }
//        }
//    }
}
