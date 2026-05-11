/* Nama File    : Burung.java
 * Deskripsi    : Kelas turunan Anabul untuk hewan burung
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class Burung extends Anabul {

    // Konstruktor
    public Burung(String nama) {
        super(nama);
    }

    // Menampilkan gerakan burung
    @Override
    public void gerak() {
        System.out.println(getNama() + " terbang");
    }

    // Menampilkan suara burung
    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkicau");
    }

    // Mengembalikan bobot burung
    @Override
    public int getBobot() {
        return 2;
    }
}