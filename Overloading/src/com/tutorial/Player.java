package com.tutorial;

public class Player {
    String nama;

    Player(String nama){
        this.nama = nama;
    }
    Player(){
        this.nama = "Player";

    }

    void show(){
        System.out.println("Nama : " + this.nama);
    }
}
