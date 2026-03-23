/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 23 Maret 2026
 */
public class Persegi extends BangunDatar{
    private double sisi;

    // konstruktor default
    public Persegi(){
        setJmlSisi(4);
    }

    // konstruktor dengan parameter 
    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    // mengambil nilai sisi persegi
    public double getSisi(){
        return sisi;
    }

    // mengubah nilai sisi persegi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // menghitung luas persegi
    public double getLuas(){
        return sisi * sisi;
    }

    // menghitung keliling persegi
    public double getKeliling(){
        return 4 * sisi;
    }

    // implement interface zoomIn
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    // implement interface zoomOut
    public void zoomOut(){
        sisi = sisi * 0.9;
    }
}
