package com.tutorial;
//import ZoroMain.nama;
//import ZoroMain.sa;
import Console.Console;

class Player1{
     private String Orang;
     private Integer jumlah;

     Player1(String nama , Integer jumlah){
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
         Player1 player1 = new Player1("Martin" , 20);
         player1.show();
         Console.log("Console Active");


     }
}