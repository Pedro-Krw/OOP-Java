package com.tutorial.Main;

class Player{
    public String nama;
    private int darah;
    private  int armor;

    Player(String nama){
        this.nama = nama;
        this.darah = 100;
        this.armor = 100;
    }

    public  void show (){
        System.out.println("Nama  : " + this.nama);
        System.out.println("Darah : " + this.MaxHeatht());
        System.out.println("Armor : "+ this.armor);
    }

   public int MaxHeatht(){
        return this.darah + this.armor * 20;
   }

}

class armor{
    private String name;
    private int senjata;

    armor(String name , int senjata){
        this.name = name;
        this.senjata = senjata;
    }
  public int getSenjata(){
        return this.senjata;
  }

}


 public class Main {
     public static void  main(String[] args){
         Player Player = new Player("Martin" );
         Player.nama = "Budi";
         armor armor = new armor("Daran Putih" , 200);
         Player.show();

     }
}