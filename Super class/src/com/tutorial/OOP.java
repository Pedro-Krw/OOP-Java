package com.tutorial;


class Fungi{
    String nama;
    String kata;

    Fungi(String nama , String kata){
        this.nama = nama;
        this.kata = kata;
    }

    void show(){
        System.out.println("Nama  :" + this.nama);
        System.out.println("Nasi  :" + this.kata);
    }

}




public class OOP {
    public static void main (String[]args){
        Fungi fungi = new Fungi("Andi " , "Makan Nasi");
        fungi.show();
    }
}
