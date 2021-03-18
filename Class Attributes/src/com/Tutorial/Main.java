package com.Tutorial;


class Playing{
     static String type = "Playing";
     private String nama;

     Playing(String nama){
         this.nama = nama;


     }
    void SeTting(String Tipe){
      Playing.type = Tipe;
     }

     public void show(){
         System.out.println("nama : " + this.nama);
     }

 }



  public class Main {
      public static void main(String[] args) {
          Playing playing1 = new Playing("Martin");
          Playing playing2 = new Playing("Joker");
          playing1.SeTting("Waramber");
          playing2.show();
          playing1.show();
          System.out.println(Playing.type);
          System.out.println(playing1.type);
          System.out.println(playing2.type);
      }
}