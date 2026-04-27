/* Nama File    : Seminar.java
 * Deskripsi    : Kelas aplikator Seminar
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class Seminar {
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    // Konstruktor Seminar
    public Seminar() {
        pesertas = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    // Registrasi peserta
    public void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        }
    }

    // Menghitung jumlah peserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // Menampilkan daftar peserta
    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(
                pesertas[i].getNomor() + " - " + pesertas[i].getNama()
            );
        }
        System.out.println();
    }

    // Menghitung jumlah mahasiswa
    public int countMahasiswa() {
        int jumlah = 0;

        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof MahasiswaSeminar) {
                jumlah++;
            }
        }

        return jumlah;
    }
}