package com.tutorial.Main;
 class Player{
     private String nama;
     private Integer power;
     private Integer Health;
     private Armor armor1;
     private senjata Senjata_Rahasia;

     Player(String nama , Integer power , Integer Health){
         this.nama = nama;
         this.power = power;
         this.Health = Health;
     }
   public void show(){
         System.out.println("Nama     : " + this.nama );
         System.out.println("Kekuatan : " + this.power);
         System.out.println("Darah    : " + this.maxHealth());
     }


  public int maxHealth(){
 return this.Health + this.armor1.getHealth();
  }

     public void setArmor(Armor armor) {
         this.armor1 = armor;
     }

     public void setSenjata_Rahasia(senjata senjata){
         this.Senjata_Rahasia = senjata;
     }


 }

class Armor{
    private String armor;
    private Integer kekuatan;
    private  Integer health;

    Armor(String armor , Integer kekuatan , Integer Health){
        this.armor = armor;
        this.kekuatan = kekuatan;
        this.health = Health;
    }

    public int getHealth() {
        return this.kekuatan * 10 + this.health;
    }
}

class senjata{
    private String nama;
     private Integer kekuatan;

     senjata(String nama, Integer kekuatan){
         this.nama = nama;
         this.kekuatan = kekuatan;
     }
}

 public class Main {
     public static void main(String [] args){
    Player Player = new Player("Martin" ,200 , 100);
    Player.show();
    Armor armor1 = new Armor("Baju emas" , 200 , 500);
    Player.setArmor(armor1);
    senjata senjata1 = new senjata("Basoka" , 5000);
    Player.setSenjata_Rahasia(senjata1);
     }
}