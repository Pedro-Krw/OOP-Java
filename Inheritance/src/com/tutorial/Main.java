package com.tutorial;

 class Hero{
     String nama;

     Hero(){
         this.nama = nama;
     }
     void show(){
         System.out.println("Nama : " + this.nama);
     }

 }

 class Hero_tank extends Hero{
 }

 class Hero_Marksman extends Hero{

 }

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero_tank();
        Hero hero3 = new Hero_Marksman();
        hero1.nama = "Nama : Martin";
        hero1.show();
        hero2.nama = "Nama : Kibax";
        hero2.show();
        hero3.nama = "Nama : Zoroman";
        hero3.show();
    }
}
