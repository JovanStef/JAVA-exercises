package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private int price;
    private String breadRollType;

    private String addition_1_Name;
    private int addition_1_Price;

    private String addition_2_Name;
    private int addition_2_Price;

    private String addition_3_Name;
    private int addition_3_Price;

    private String addition_4_Name;
    private int addition_4_Price;

    public Hamburger(String name, String meat, int price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAdd_1(String name , int price){
        this.addition_1_Name = name;
        this.addition_1_Price = price;
    }

    public void addHamburgerAdd_2(String name , int price){
        this.addition_2_Name = name;
        this.addition_2_Price = price;
    }

    public void addHamburgerAdd_3(String name , int price){
        this.addition_3_Name = name;
        this.addition_3_Price = price;
    }

    public void addHamburgerAdd_4(String name , int price){
        this.addition_4_Name = name;
        this.addition_4_Price = price;
    }

    public int itemizeHamburger(){
        int hamburgerPrice = this.price;
        System.out.println(this.name+" hamburger on a " + this.breadRollType+" roll"+this.meat+ " meat price "+this.price);

        if(addition_1_Name != null){
            hamburgerPrice+=this.addition_1_Price;
            System.out.println("Added "+ this.addition_1_Name+" for an extra "+this.addition_1_Price);
        }
        if(addition_2_Name != null){
            hamburgerPrice+=this.addition_2_Price;
            System.out.println("Added "+ this.addition_2_Name+" for an extra "+this.addition_2_Price);
        }
        if(addition_3_Name != null){
            hamburgerPrice+=this.addition_3_Price;
            System.out.println("Added "+ this.addition_3_Name+" for an extra "+this.addition_3_Price);
        }
        if(addition_4_Name != null){
            hamburgerPrice+=this.addition_4_Price;
            System.out.println("Added "+ this.addition_4_Name+" for an extra "+this.addition_4_Price);
        }

        return hamburgerPrice;
    }
}
