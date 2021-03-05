package com.Tutorial;

  class Barang {
      String Nama_Barang;
      String Jumlah_Barang;
      String Tanggal_Barang;

//      constactor

      Barang(String Nama_Barang , String Jumlah_Barang , String Tanggal_Barang){
          this.Nama_Barang = Nama_Barang;
          this.Jumlah_Barang = Jumlah_Barang;
          this.Tanggal_Barang = Tanggal_Barang;

          System.out.println("Nama Barang :" + Nama_Barang);
          System.out.println("jumlah Barang :" + Jumlah_Barang);
          System.out.println("Tanggal Barang Datang :" + Tanggal_Barang);
      }
  }



 public class Main {
//Object
      public static void main(String[] args){
          Barang Barang = new Barang(" Laptop Asus Rog", " 2", " 23 Maret 2021");

      }
}