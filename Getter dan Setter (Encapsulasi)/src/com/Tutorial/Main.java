package com.Tutorial;

   class Komik{
       private int nomor;
       public String nama;

       Komik(int nomor , String nama){
           this.nomor = nomor;
           this.nama = nama;

       }
       void show (){
           System.out.println("\nNama Komik\t : " + this.nama);
           System.out.println("Chapter : " + this.nomor);

       }
   }


 public class Main {
      public static void main(String[]args){
          Komik Komik = new Komik(23 , "komik naruto");
          Komik.nama = "Minato";
          System.out.println(Komik.nama);


      }

}