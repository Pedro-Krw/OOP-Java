package com.Tutorial;

   class Data{
       public int intPublic;
       private int intPrivate;
       private  double doublePrivate;

       Data(){
           this.intPublic = 0;
           this.intPrivate = 0;
       }
// ini bagian GETTER
       public int getIntPrivate() {
           return this.intPrivate;
       }

//       Ini bagian SETTER
       void setIntPrivate(double value){
          this.doublePrivate = value;
       }
   }

  public class Main {
      public static void main(String[] args){
       Data Data = new Data();
          Data.intPublic = 10;
          System.out.println(Data.intPublic);
//          Ini adalah GETTER Read Only Pada mudule Private
          int agnka = Data.getIntPrivate();
          System.out.println(agnka);
//          Ini adalah SETTER Write only Pada Module Private
          Data.setIntPrivate(0.3);

      }
}