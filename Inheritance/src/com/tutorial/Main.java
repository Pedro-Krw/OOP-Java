package com.tutorial;

 class Hero{
     String nama;

     Hero(){
         this.nama = nama;
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
        System.out.println(hero1.nama);
        hero2.nama = "Nama : Kibax";
        System.out.println(hero2.nama);
        hero3.nama = "Nama : Zoroman";
        System.out.println(hero3.nama);
    }
}
