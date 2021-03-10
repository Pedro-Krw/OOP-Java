package com.tutorial.Main;

class Player{
    String nama;
    private int darah;
    private  int armor;

    Player(String nama){
        this.nama = nama;
        this.darah = 100;
        this.armor = 100;
    }

    public  void show (){
        System.out.println("Nama  : " + this.nama);
        System.out.println("Darah : " + this.darah);
        System.out.println("Armor : "+ this.armor);
    }

}
 public class Main {
     public static void  main(String[] args){
         Player Player = new Player("Martin" );
         Player.show();

     }
}