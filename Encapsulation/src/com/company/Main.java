package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Tim";
//        player.health = 200;
//        player.weapon = "sword";
//
//        int damage = 120;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//
//        damage = 120;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());


		EnhancedPlayer player = new EnhancedPlayer("Wayo", 800, "Gun");
		System.out.println("Inital health is " + player.getHitPoints());
    }


}
