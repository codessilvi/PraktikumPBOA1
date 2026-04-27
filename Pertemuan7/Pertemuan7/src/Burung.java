/* Nama File    : Burung.java
 * Deskripsi    : Kelas turunan Burung dari Anabul
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi cuit");
    }
}