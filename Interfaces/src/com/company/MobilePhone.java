package com.company;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Phone is on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now dialing "+ phoneNumber);
        }else{
            System.out.println("battery assys");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("RRRRRRRRRRRRRRRRRRIIIIIIIIIIIIIIIIIIIIIINNNNNNNNNNNNGGGGGGGGGGGGGG");
        }else{
            isRinging = false;
            System.out.println("Phone off");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
