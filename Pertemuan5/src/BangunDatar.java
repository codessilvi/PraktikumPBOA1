/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 23 Maret 2026
 */

public abstract class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    
    public BangunDatar(){
        // Konstruktor tanpa parameter
    }

    // mengambil jumlah sisi bangun datar
    public int getJmlSisi(){
        return jmlSisi;
    }

    // mengubah jumlah sisi bangun datar
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    // mengambil warna bangun datar
    public String getWarna(){
        return warna;
    }

    // mengubah warna bangun datar
    public void setWarna(String warna){
        this.warna = warna;
    }

    // mengambil warna border bangun
    public String getBorder(){
        return border;
    }

    // mengubah border bangun
    public void setBorder(String border){
        this.border = border;
    }

    // method abstract untuk menghitung luas bangundatar
    public abstract double getLuas();
    
    // method abstract untuk menghitung keliling bangundatar
    public abstract double getKeliling();

    // menampilkan informasi bangun datar
    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}


