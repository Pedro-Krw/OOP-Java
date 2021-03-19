package com.tutorial;
import Console.Console;

class Player{
     private String Orang;
     private Integer jumlah;

     Player(String nama , Integer jumlah){
         this.Orang = nama;
         this.jumlah = jumlah;
     }

     void show(){
         System.out.println("nama   : " + this.Orang);
         System.out.println("jumlah : " + this.jumlah );
     }


 }

 public class Main {
     public static void main(String[] args) {
         Player player1 = new Player("Martin" , 20);
         player1.show();
         Console.log("Jamal");


     }
}