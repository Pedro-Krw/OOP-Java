package com.Tutorial;


class Merek{
       String nama;
       String harga;
       String banyak;

       Merek(String nama, String harga , String banyak){
           this.nama = nama;
           this.harga = harga;
           this.banyak = banyak;
       }

       void Tampilan(){
           System.out.println("Nama Motor : "+ nama);
           System.out.println("Harga Motor : " + harga);
           System.out.println("Jumlah Motor : "+ banyak);
       }

   }






 public class Main {

     public static void main (String[]args){
         Merek Merek = new Merek("Honda", "30 Juta", "15 Unit");
         Merek.Tampilan();
     }
}