package com.Tutorial;

 class Playing{
     private String nama;

     Playing(String nama){
         this.nama = nama;


     }
     public void show(){
         System.out.println("nama : " + this.nama);
     }

 }



  public class Main {
      public static void main(String[] args) {
          Playing playing1 = new Playing("Martin");
          playing1.show();
      }
}