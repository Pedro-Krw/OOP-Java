package com.tutorial;

 class  Buku{
     String Nama;
     String Penulis;

      Buku(String Buku , String Penulis){
          this.Nama = Buku;
          this.Penulis = Penulis;
      }
      void show (){
          System.out.println("\nJudul Buku : " + this.Nama);
          System.out.println("Penulis : " + this.Penulis);
      }
 }

public class Main {
    public static void main(String [] args){
        Buku Buku1 = new Buku("Mencari Masa Depan ", "Pedro T Korwa");
        Buku1.show();

    }
}
