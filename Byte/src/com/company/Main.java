package com.company;

public class Main {

    public static void main(String[] args) {

//        int myMinIntValue = Integer.MIN_VALUE;
//        int myMaxIntValue = Integer.MAX_VALUE;
//
//        System.out.println("Integer Minimum Value = "  + myMinIntValue);
//        System.out.println("Integer Maximum Value = " + myMaxIntValue);
//
//        System.out.println("Busted MAX = "+ (myMaxIntValue + 1));
//        System.out.println("Busted MIN = "+ (myMinIntValue - 1));
//
//
//
//        byte MyMinByteValue = Byte.MIN_VALUE;
//        byte MyMaxByteValue = Byte.MAX_VALUE;
//
//        System.out.println("Byte Minimum Value = "+MyMinByteValue);
//        System.out.println("Byte Maximum Value = "+MyMaxByteValue);
//
//        short MyMinShortValue = Short.MIN_VALUE;
//        short MyMaxShortValue = Short.MAX_VALUE;
//
//        System.out.println("Short Minimum Value = "+MyMinShortValue);
//        System.out.println("Short Maximum Value = "+MyMaxShortValue);
//
//        long MyMinLongValue = Long.MIN_VALUE;
//        long MyMaxLongValue = Long.MAX_VALUE;
//
//        System.out.println("Long Minimum Value = "+MyMinLongValue);
//        System.out.println("Long Maximum Value = "+MyMaxLongValue);
//
//        byte myNewByteValue = (byte) (MyMinByteValue/2);

//        byte someByte = 100;
//
//        short someShort = 5000;
//
//        int someInt = 22000;
//
//        long someLong = 5000+10*(someByte+someByte+someShort+someInt);
//
//        System.out.println(someLong);


//        float myMinFloatValue = Float.MIN_VALUE;
//        float myMaxFloatValue = Float.MAX_VALUE;
//        System.out.println("Min Float = "+ myMinFloatValue);
//        System.out.println("Max Float = "+myMaxFloatValue);
//
//        double myMinDoubleValue = Double.MIN_VALUE;
//        double myMaxDoubleValue = Double.MAX_VALUE;
//        System.out.println("Min Double = "+ myMinDoubleValue);
//        System.out.println("Max Double = "+myMaxDoubleValue);

//        int myInt = 5/3;
//        float myFloat = 5f/3f;
//        double myDouble = 5d/3d;

//        System.out.println("MyIntValue = "+myInt);
//        System.out.println("MyFloatValue = "+myFloat);
//        System.out.println("My Double = "+myDouble);

//        double pound = 2.8d;
//        double kilo = 0.45359237;
//        double result = pound*kilo;
//
//        System.out.println(result);
        boolean gameOver =true;
        int score = 800;
        int levelCopmpleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCopmpleted,bonus);
        System.out.println("Your final score was "+ highScore);

        score = 10000;
        levelCopmpleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver,score,levelCopmpleted,bonus);
        System.out.println("Your final score was "+ highScore);

    }

    public static int calculateScore(boolean gameOver,int score,int levelCopmpleted,int bonus){

        if(gameOver){
            int finalScore = score+(levelCopmpleted*bonus);
            finalScore += 1000;

            return  finalScore;
        }
        return -1;
    }
}


