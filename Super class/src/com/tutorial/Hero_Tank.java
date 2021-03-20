package com.tutorial;

public class Hero_tank extends Main {
    String nama;

    Hero_tank(String nama ){
        this.nama = nama;
    }
    void display(){
        System.out.println("Nama : " + this.nama);
    }
}
