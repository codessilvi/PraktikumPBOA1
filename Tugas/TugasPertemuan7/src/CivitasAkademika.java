/* Nama File    : CivitasAkademika.java
 * Deskripsi    : Kelas induk civitas akademika
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class CivitasAkademika {
    private String nama;

    // Konstruktor default
    public CivitasAkademika() {
        nama = "Tidak diketahui";
    }

    // Konstruktor dengan parameter nama
    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    // Mengambil nama
    public String getNama() {
        return nama;
    }

    // Mengubah nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengambil nomor identitas
    public String getNomor() {
        return "-";
    }
}