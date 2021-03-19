package ZoroMain;

class Nama{
    private String nama;
    private int umur;

    Nama(String nama , int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public void setAnjing() {
        this.nama = nama;
        this.umur = umur;
    }

    public void getSemua() {
         setAnjing();
    }
}


public class Zoro {
    public static void main(String[] args) {
        Nama nama1 = new Nama("Zoro " , 1);



    }
}
