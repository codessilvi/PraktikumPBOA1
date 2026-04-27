/* Nama File    : MahasiswaSeminar.java
 * Deskripsi    : Kelas turunan Mahasiswa dari CivitasAkademika
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class MahasiswaSeminar extends CivitasAkademika {
    private String nim;
    private Dosen dosenWali;

    // Konstruktor Mahasiswa
    public MahasiswaSeminar(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    // Mengambil NIM
    public String getNim() {
        return nim;
    }

    // Mengubah NIM
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Override getNomor
    @Override
    public String getNomor() {
        return nim;
    }

    // Mengubah dosen wali
    public void setWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Menampilkan data mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + getNama());
        System.out.println("Dosen Wali  : " + dosenWali.getNama());
        System.out.println();
    }
}