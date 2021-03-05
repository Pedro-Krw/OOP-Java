package  com.Tutorial;

     class Nama_HandPhoe{
         String Nama;
         String Harga;
         String kamera;

         Nama_HandPhoe(String Nama_Handphone , String Harga, String kamera){
             this.Nama = Nama_Handphone;
             this.Harga = Harga;
             this.kamera = kamera;
         }

         void Show(){
             System.out.println("Nama Merek HandPhone : " + Nama);
             System.out.println("Harga Barang : " + Harga);
             System.out.println("Ukuran Kamera : " + kamera);
         }

     }

 public class Main {
     public static void main(String[] args){
         Nama_HandPhoe NamaHandPhone = new Nama_HandPhoe("Samsung" , "2 Juta" ,"20 megapixel");
         NamaHandPhone.Show();
     }
}