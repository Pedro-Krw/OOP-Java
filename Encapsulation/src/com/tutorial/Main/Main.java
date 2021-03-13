package com.tutorial.Main;
 class Player{
     private String nama;
     private Integer power;
     private Integer Health;

     Player(String nama , Integer power , Integer Health){
         this.nama = nama;
         this.power = power;
         this.Health = Health;
     }
     void show(){
         System.out.println("Nama : " + this.nama );
         System.out.println("Kekuatan : " + this.power);
         System.out.println("Darah : " + this.Health);
     }
 }

 public class Main {
     public static void main(String [] args){
    Player Player = new Player("MArtin" ,200 , 100);
    Player.show();
     }
}