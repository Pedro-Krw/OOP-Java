package com.Tutorial;

  class Toko_Online{
      String nama;
      String alamat;
      int Kode_Pos;

      Toko_Online(String matoa , String jalan, int kode){
          nama = matoa;
          alamat = jalan;
          Kode_Pos = kode;
      }


  }

 public class Main {
     public static void main (String[] args){
         Toko_Online tokominuman = new Toko_Online("Toko Keren ", "impres ",95111);
         System.out.println(tokominuman.nama);
         System.out.println(tokominuman.alamat);
         System.out.println(tokominuman.Kode_Pos);



     }
}