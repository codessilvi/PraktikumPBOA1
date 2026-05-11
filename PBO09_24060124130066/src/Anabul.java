/* Nama File    : Anabul.java
 * Deskripsi    : Kelas induk hewan peliharaan (Anabul)
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class Anabul {
    private String nama;

    // Konstruktor default
    public Anabul() {
        nama = "Tidak diketahui";
    }

    // Konstruktor dengan parameter nama
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // Mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Menampilkan cara bergerak umum
    public void gerak() {
        System.out.println(nama + " bergerak");
    }

    // Menampilkan suara umum
    public void bersuara() {
        System.out.println(nama + " bersuara");
    }

    // Mengembalikan bobot default
    public int getBobot() {
        return 0;
    }
}