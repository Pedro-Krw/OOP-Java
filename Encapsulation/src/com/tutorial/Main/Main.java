package com.tutorial.Main;
   class player{
       public String name;
       private Integer atrtack;
       private Integer Speed;

       player(String name , Integer atrtack, Integer Speed){
           this.atrtack = atrtack;
           this.name = name;
           this.Speed = Speed;
       }
     void show(){
         System.out.println("Nama : " + this.name);
         System.out.println("Attack : " +this.atrtack);
         System.out.println("Speed : " + this.Speed);
     }

   }

   public class Main {
       public static void main(String[]args) {
       player player = new player("Ica" , 20 , 100);
       player.show();
       }
       }
