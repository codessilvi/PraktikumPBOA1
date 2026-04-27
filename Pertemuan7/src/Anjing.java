/* Nama File    : Anjing.java
 * Deskripsi    : Kelas turunan Anjing dari Anabul
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berbunyi guk-guk");
    }
}