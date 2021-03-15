package com.tutorial.Main;

class Player{
    public String name;
    private Integer Health;
    private Integer Demage;
    private Armor  armor;

    Player(String name , Integer Health , Integer Demage ){
        this.name = name;
        this.Health = Health;
        this.Demage = Demage;
    }
    public void Show(){
        System.out.println("Nama   : " + this.name);
        System.out.println("Health : " + this.Health);
        System.out.println("Demage : " + this.Demage);
        this.armor.getAddHealth();
    }
    public Armor setArmor(Armor armor) {
        return this.armor = armor;
    }

    public int MaxHealth(){
        return this.Health + this.armor.getAddHealth()*10;
    }

}

class Armor{
    private String Name;
    private  Integer Demage;
    private Integer AddHealth;

    public Armor(String Name , Integer demage , Integer addHealth){
        this.Name = Name;
        this.Demage = demage;
        this.AddHealth = addHealth;
    }

    public Integer getAddHealth() {
        return this.Demage *10 + this.AddHealth;
    }
}



public class Main {
    public static void main(String[]args){
        Player player1 = new Player("Martin" , 100 , 2000  );
        Armor armor = new Armor("Baju Emas" , 2500 , 150);
        player1.Show();
    }
}