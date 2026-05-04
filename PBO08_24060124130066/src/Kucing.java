/* Nama File    : Kucing.java
 * Deskripsi    : Kelas turunan Kucing dari Anabul
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class Kucing extends Anabul {

    // Atribut bobot (kg) 
    protected double bobot;

    // Konstruktor Kucing
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // Getter bobot
    public double getBobot() {
        return bobot;
    }

    // Setter bobot
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    // Override method gerak
    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    // Override method bersuara
    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi meong");
    }
}