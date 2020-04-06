package com.company;

public class Main {

    public static void main(String[] args) {
	double inches = calcFeetAndInchesToCentimeters(2,15);
        double centimeters=calcFeetAndInchesToCentimeters(inches);
            System.out.println(centimeters);
    }

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet>=0 && inches>=0 && inches<=12){
            return -1;
        }
        double feetToInches = (feet * 12)+inches;
        return feetToInches;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<=0){
            return -1;
        }
        return inches * 2.54;
    }
}
