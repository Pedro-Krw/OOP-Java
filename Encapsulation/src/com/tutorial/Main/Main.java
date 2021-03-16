package com.tutorial.Main;

 class Player{
      private String nama;
      private Integer Health;
      private String Weapon;
      Armor armor;

      Player(String nama , Integer Health , String weapon){
          this.nama = nama;
          this.Health = Health;
          this.Weapon = weapon;

      }

      public void Show(){
          System.out.println("Nama   : " + this.nama );
          System.out.println("Health : " + this.MaxHealth());
          System.out.println("Weapon : " + this.Weapon);
      }

     public void setArmor(Armor armor) {
         this.armor = armor;
     }

     public int MaxHealth(){
         return this.Health + this.armor.getKekuatan();
     }

 }

 class Armor {
     private String nama;
     private Integer Kekuatan;
     private Integer trueDemage;

     Armor (String nama , Integer kekuatan , Integer trueDemage){
         this.nama = nama;
         this.Kekuatan = kekuatan;
         this.trueDemage = trueDemage;
     }

     public Integer getKekuatan() {
         return this.Kekuatan + this.trueDemage;
     }
 }



 public class Main {
     public static void main(String[] args) {
         Player player1 = new Player("Martin" , 150 , "Parang Sabel");
         Armor armor = new Armor("Parang" , 350 , 5000);
         player1.setArmor(armor);
         player1.Show();
     }
}