/* Nama File    : Anabul.java
 * Deskripsi    : Kelas induk hewan peliharaan (Anabul)
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class Anabul {
    private String nama;

    public Anabul() {
        nama = "Tidak diketahui";
    }

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println(nama + " bergerak");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara");
    }
}