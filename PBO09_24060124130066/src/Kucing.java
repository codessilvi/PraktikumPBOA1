/* Nama File    : Kucing.java
 * Deskripsi    : Kelas turunan Anabul untuk hewan kucing
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class Kucing extends Anabul {

    // Konstruktor
    public Kucing(String nama) {
        super(nama);
    }

    // Menampilkan gerakan kucing
    @Override
    public void gerak() {
        System.out.println(getNama() + " melata");
    }

    // Menampilkan suara kucing
    @Override
    public void bersuara() {
        System.out.println(getNama() + " mengeong");
    }

    // Mengembalikan bobot kucing
    @Override
    public int getBobot() {
        return 4;
    }
}