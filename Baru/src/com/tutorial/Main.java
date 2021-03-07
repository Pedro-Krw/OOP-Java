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
