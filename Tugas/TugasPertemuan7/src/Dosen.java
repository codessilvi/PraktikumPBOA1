/* Nama File    : Dosen.java
 * Deskripsi    : Kelas turunan Dosen dari CivitasAkademika
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class Dosen extends CivitasAkademika {
    private String nip;

    // Konstruktor Dosen
    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    // Mengambil NIP
    public String getNip() {
        return nip;
    }

    // Mengubah NIP
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Override getNomor
    @Override
    public String getNomor() {
        return nip;
    }
}