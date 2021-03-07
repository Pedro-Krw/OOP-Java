package com.Tutorial;

//Player
class Player{
    String Nama;
    Double Health;
    int Level;
    //    Object Data
    Armor armor;
    Weapon weapon;

    Player (String Nama , Double Health){
        this.Nama = Nama;
        this.Health = Health;
    }

    void show (Weapon weapon ){
        this.weapon = weapon;
    }

}

//Weapon
class Weapon{
    Double attackPower;
    String nama;
    Weapon (String nama,Double attackPower){
        this.attackPower = attackPower;
        this.nama = nama;

    }
    void display (){
        System.out.println("Weapon : " + this.nama + "Power : " + this.attackPower);
    }

}

//Armor
class Armor {
    Double DefancePower;

    Armor (Double DefancePower){
        this.DefancePower = DefancePower;
    }

}


public class Main {
    public static void main(String[] args){

//        Membuat Object Player
        Player player1 = new Player("Bobi" , 1.000);
//        Object Ke 2
        Weapon pedang = new Weapon("Pedang Baja ", 20.000);
//        Armor
        Armor Baju = new Armor(5.000);
//        Mengambil Barang
        player1.show(pedang);
        player1.weapon.display();



    }
}
