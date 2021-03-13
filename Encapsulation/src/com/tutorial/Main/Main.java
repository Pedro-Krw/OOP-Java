package com.tutorial.Main;
 class Player{
     private String nama;
     private Integer power;
     private Integer Health;
     private Armor armor;

     Player(String nama , Integer power , Integer Health){
         this.nama = nama;
         this.power = power;
         this.Health = Health;
     }
   public void show(){
         System.out.println("Nama     : " + this.nama );
         System.out.println("Kekuatan : " + this.power);
         System.out.println("Darah    : " + this.Health);
     }

     public void setArmor(Armor armor) {
         this.armor = armor;
     }

 }

class Armor{
    private String armor;
    private Integer kekuatan;

    Armor(String armor , Integer kekuatan){
        this.armor = armor;
        this.kekuatan = kekuatan;
    }

}

 public class Main {
     public static void main(String [] args){
    Player Player = new Player("Martin" ,200 , 100);
    Player.show();
    Armor armor1 = new Armor("Baju emas" , 200);
    Player.setArmor(armor1);
     }
}