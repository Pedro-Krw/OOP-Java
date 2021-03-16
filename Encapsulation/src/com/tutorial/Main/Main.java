package com.tutorial.Main;

 class Player{
      private String nama;
      private Integer Health;
      private Integer Weapon;

      Player(String nama , Integer Health , Integer weapon){
          this.nama = nama;
          this.Health = Health;
          this.Weapon = weapon;

      }

      public void Show(){
          System.out.println("Nama   : " + this.nama );
          System.out.println("Health : " + this.Health);
          System.out.println("Weapon : " + this.Weapon);
      }


 }


 public class Main {
     public static void main(String[] args) {
         Player player1 = new Player("Martin" , 150 , 300);
         player1.Show();
     }
}