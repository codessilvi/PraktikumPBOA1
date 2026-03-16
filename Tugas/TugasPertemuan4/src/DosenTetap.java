/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 9 Maret 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {

    private String nidn;
    private final int BUP = 65;

    // konstruktor tanpa parameter
    public DosenTetap() {

    }

    // konstruktor dengan parameter
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir,
                    LocalDate tmt, double gajiPokok,
                    String fakultas, String nidn) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // mengambil NIDN
    public String getNidn() {
        return nidn;
    }

    // menghitung tunjangan dosen tetap
    public double getTunjangan() {
        int masaKerja = getMasaKerja().getYears();
        return 0.02 * masaKerja * gajiPokok;
    }

    // menampilkan informasi dosen tetap
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN : " + nidn);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("BUP : " + BUP + " tahun");
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}