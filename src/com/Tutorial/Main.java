package com.Tutorial;

    class Rumah{
        String nama;
        String alamat;
        double ukuran;

        Rumah(String nama, String alamat, Double ukuran){
            this.nama = nama;
            this.alamat = alamat;
            this.ukuran = ukuran;
        }

         void show (){
             System.out.println("Nama Perumahan : " + nama);
             System.out.println("Alamat Perumahan : " + alamat);
             System.out.println("Ukuran Rumah : " + ukuran);
         }

    }



 public class Main {
     public static void main(String[] args){
         Rumah Rumah = new Rumah("Perumahan Griya Mandow" , "Jlan.Mandow Dalam" , 0.20);
         Rumah.show();

     }
}