package com.tutorial;

public class Player {
    public static int jumlahPlayer;
    String nama;

    Player(String nama){
        Player.jumlahPlayer++;
        this.nama = nama;
    }
    Player(){
        Player.jumlahPlayer++;
        this.nama = "Player : " + Player.jumlahPlayer;

    }

    void show(){
        System.out.println("Nama : " + this.nama);
    }
}
