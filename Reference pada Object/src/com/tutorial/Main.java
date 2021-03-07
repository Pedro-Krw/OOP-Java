package com.tutorial;

import java.nio.channels.Pipe;
import java.security.Security;

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
        String addres2 = Integer.toHexString(System.identityHashCode(Buku1));
        Buku1.show();
        System.out.println(addres2);
        System.out.println(Buku1);
    }
}



// Bagian Ke Dua
   class Daftar {
      /*ini adalah modifier*/public /* ini adalah member*/  String Lagu;
       private String musisi;

       Daftar(String Lagu , String musisi){
           this.Lagu = Lagu;
           this.musisi = musisi;

  }
      void show(){
          System.out.println("\nJudul Lagu : " + this.Lagu);
          System.out.println("Nama Musisi : " + this.musisi);
      }

   }

   public class Main {
       public static void main (String[] args){
           Daftar Bagian = new Daftar("To The Bone " , "Pamugkas");
           System.out.println(Bagian.Lagu;

       }
}
