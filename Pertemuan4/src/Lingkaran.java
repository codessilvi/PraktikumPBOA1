/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 9 Maret 2026
 */
public class Lingkaran extends BangunDatar{
    private double jari;

    // konstruktor default
    public Lingkaran(){
        setJmlSisi(1);
    }

    // konstruktor dengan parameter 
    public Lingkaran (double diameter, String warna, String border){
        this.jari = diameter/2;
        setWarna(warna);
        setBorder(border);
    }

    // mengambil nilai jari-jari lingkaran
    public double getJari (){
        return jari; 
    }

    // mengubah nilai jari-jari lingkaran
    public void setJari(double jari){
        this.jari = jari;
    }

    // menghitung luas lingkaran
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    // menghitung keliling lingkaran
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }
}