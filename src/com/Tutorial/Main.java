package com.Tutorial;

 class Anjing{
     String Nama_Anjing;
     int Umur_Anjing;
      int Jumlah_Anjig;

      Anjing (String zoro, Integer umur, Integer jumlah){

          Nama_Anjing = zoro;
          Umur_Anjing = umur;
          Jumlah_Anjig = jumlah;
      }
 }


public class Main {
     public static void main (String[] args){

         Anjing ajing = new Anjing("Zoro Anjing Nakal", 1 , 7);
         System.out.println(ajing.Nama_Anjing);
         System.out.println(ajing.Umur_Anjing);
         System.out.println(ajing.Jumlah_Anjig);


     }

}