/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 9 Maret 2026
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {

    private String nidk;
    private LocalDate tanggalBerakhirKontrak;

    // konstruktor tanpa parameter
    public DosenTamu() {

    }

    // konstruktor dengan parameter
    public DosenTamu(String nip, String nama, LocalDate tanggalLahir,
                    LocalDate tmt, double gajiPokok,
                    String fakultas, String nidk,
                    LocalDate tanggalBerakhirKontrak) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    // mengambil NIDK
    public String getNidk() {
        return nidk;
    }

    // menghitung tunjangan dosen tamu
    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    // menampilkan informasi dosen tamu
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK : " + nidk);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Kontrak Berakhir : " + tanggalBerakhirKontrak);
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}