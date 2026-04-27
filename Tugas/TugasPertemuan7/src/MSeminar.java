/* Nama File    : MSeminar.java
 * Deskripsi    : Program utama simulasi Seminar
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class MSeminar {

    // Program utama
    public static void main(String[] args) {

        // Membuat objek dosen
        Dosen d1 = new Dosen("Pak Eko", "D001");
        Dosen d2 = new Dosen("Bu Khadijah", "D002");

        // Membuat objek mahasiswa
        MahasiswaSeminar m1 = new MahasiswaSeminar("Ovi", "24060124555");
        MahasiswaSeminar m2 = new MahasiswaSeminar("Nouvel", "24060124222");
        MahasiswaSeminar m3 = new MahasiswaSeminar("Eileen", "24060124888");
        MahasiswaSeminar m4 = new MahasiswaSeminar("Biyani", "24060124000");
        MahasiswaSeminar m5 = new MahasiswaSeminar("Andiny", "24060124444");

        // Mengatur dosen wali
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        // Membuat seminar
        Seminar s = new Seminar();

        // Registrasi peserta
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // Menampilkan peserta
        System.out.println("Daftar Peserta:");
        s.tampilPeserta();

        // Menampilkan jumlah peserta
        System.out.println("Jumlah Peserta     : " + s.countPeserta());
        System.out.println("Jumlah Mahasiswa   : " + s.countMahasiswa());
        System.out.println();

        // Menampilkan data mahasiswa
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
    }
}