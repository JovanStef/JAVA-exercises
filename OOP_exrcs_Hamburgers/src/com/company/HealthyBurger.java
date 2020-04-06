package com.company;

public class HealthyBurger extends Hamburger {
     private String healthyExtra_1_Name;
     private int healthyExtra_1_Price;

    private String healthyExtra_2_Name;
    private int healthyExtra_2_Price;

    public HealthyBurger( String meat, int price) {
        super("Healthy", meat, price, "Brown");
    }

    public void addHealthyAddition_1(String name , int price){
        this.healthyExtra_1_Name = name;
        this.healthyExtra_1_Price = price;
    }

    public void addHealthyAddition_2(String name , int price){
        this.healthyExtra_2_Name = name;
        this.healthyExtra_2_Price = price;
    }

    @Override
    public int itemizeHamburger(){
        int hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra_1_Name != null){
            hamburgerPrice+=this.healthyExtra_1_Price;
            System.out.println("Added "+ this.healthyExtra_1_Name+" for an extra "+this.healthyExtra_1_Price);
        }
        if(healthyExtra_2_Name != null){
            hamburgerPrice+=this.healthyExtra_2_Price;
            System.out.println("Added "+ this.healthyExtra_2_Name+" for an extra "+this.healthyExtra_2_Price);
        }

        return hamburgerPrice;
    }
}
