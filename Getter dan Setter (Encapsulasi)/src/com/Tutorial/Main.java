package com.Tutorial;

   class Data{
       public int intPublic;
       private int intPrivate;

       Data(){
           this.intPublic = 0;
           this.intPrivate = 0;
       }

       public int getIntPrivate() {
           return this.intPrivate;
       }
   }

  public class Main {
      public static void main(String[] args){
       Data Data = new Data();
          Data.intPublic = 10;
          System.out.println(Data.intPublic);
          int agnka = Data.getIntPrivate();
          System.out.println(agnka);

      }
}