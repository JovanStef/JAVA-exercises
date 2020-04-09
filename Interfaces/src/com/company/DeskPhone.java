package com.company;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private  boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dialing " + phoneNumber);
    }

    @Override
    public void answer() {
    if(isRinging){
        System.out.println("Answering the phone");
        isRinging = false;
    }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("RRRRRRRRRRRRRRRRRRIIIIIIIIIIIIIIIIIIIIIINNNNNNNNNNNNGGGGGGGGGGGGGG");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
