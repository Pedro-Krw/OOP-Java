package com.tutorial;


class Fungi{
    String nama;
    String kata;

    Fungi(String nama , String kata){
        this.nama = nama;
        this.kata = "makan";
    }

    void show(){
        System.out.println("Nama  :" + this.nama);
        System.out.println(   this.kata);
    }

}



public class OOP {
    public static  void main(String[] args){
        Fungi fungi = new Fungi("Andi " , "Makan Nasi");
        Fungi fungi1 = new Fungi("ana " , fungi.kata);
        fungi1.show();
        fungi.show();
    }
}
