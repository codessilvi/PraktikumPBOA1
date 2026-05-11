/* Nama File    : Anjing.java
 * Deskripsi    : Kelas turunan Anabul untuk hewan anjing
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class Anjing extends Anabul {

    // Konstruktor
    public Anjing(String nama) {
        super(nama);
    }

    // Menampilkan gerakan anjing
    @Override
    public void gerak() {
        System.out.println(getNama() + " berlari");
    }

    // Menampilkan suara anjing
    @Override
    public void bersuara() {
        System.out.println(getNama() + " menggonggong");
    }

    // Mengembalikan bobot anjing
    @Override
    public int getBobot() {
        return 10;
    }
}