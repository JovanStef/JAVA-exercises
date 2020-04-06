package com.company;

public class Account {

    private int accNumber;
    private int ballance;
    private String customerName;
    private String email;
    private String phone;

    public Account (){
        this(123456,1000,"Name","mail","555");
    }

    public Account (int accNumber , int ballance , String customerName, String email , String phone){
        this.accNumber = accNumber;
        this.ballance = ballance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

//    ACC
    public void setAccNumber(int accNumber){
        this.accNumber = accNumber;
    }
    public int getAccNumber(){
        return this.accNumber;
    }

//    BALLANCE
    public int getBallance(){
        return this.ballance;
    }
    public void deposit(int addBallance){
        this.ballance +=addBallance;
        System.out.println(addBallance + " Funds added ,current balance: "+ this.getBallance());
    }
    public void withdraw(int removeBallance){
        int currentBallance = this.getBallance();
        if(currentBallance<removeBallance){
            System.out.println("Insufficient funds --> "+ currentBallance+" funds available");
        }else{
            this.ballance-=removeBallance;
            System.out.println(removeBallance+"funds removed --> "+ this.getBallance()+" funds available");
        }
    }

//    CUSTOMER NAME
    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String name){
        this.customerName = name;
    }

//    EMAIL & PHONE


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
