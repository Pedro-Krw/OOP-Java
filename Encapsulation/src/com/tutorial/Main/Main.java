package com.tutorial.Main;

 class Player {
     private String nama;
     private Integer Health;
     private Integer Attack;
     private senjata_rahasia Senjat1;

     Player(String nama, Integer Health, Integer Attack) {
         this.nama = nama;
         this.Health = Health;
         this.Attack = Attack;

     }

     public void show() {
         System.out.println("Nama   : " + this.nama);
         System.out.println("Health : " + this.Health);
         System.out.println("Attack : " + this.Attack);
     }

     public void setKumpulan(senjata_rahasia senjat1) {
         this.nama = nama;
     }

     public String MaxHealth() {
         return this.Health + this.Senjat1.getParang();

     }

     static class senjata_rahasia {
         private String nama;
         private Integer true_Damage;
         private Integer Bonus_Attack;

         senjata_rahasia(String nama, Integer true_Damage, Integer Bonus) {
             this.nama = nama;
             this.true_Damage = true_Damage;
             this.Bonus_Attack = Bonus;

         }

         public String getParang() {
             return this.nama + this.true_Damage + this.Bonus_Attack + this.Bonus_Attack;
         }
     }


     public static class Main {
         public void main(String[] args) {
             Player player1 = new Player("tinus", 1200, 2000);
             senjata_rahasia senjat = new senjata_rahasia("Ak-47", 400, 150);
             player1.show();
         }
     }
 }