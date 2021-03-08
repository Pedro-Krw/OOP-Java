package com.Tutorial;

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
           System.out.println(Bagian.Lagu);

       }
}