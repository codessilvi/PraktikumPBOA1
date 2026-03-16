/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 9 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {

    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    // konstruktor tanpa parameter
    public Pegawai() {

    }

    // konstruktor dengan parameter
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // mengambil NIP
    public String getNip() {
        return nip;
    }

    // mengambil nama pegawai
    public String getNama() {
        return nama;
    }

    // mengambil tanggal lahir
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    // mengambil TMT
    public LocalDate getTmt() {
        return tmt;
    }

    // mengambil gaji pokok
    public double getGajiPokok() {
        return gajiPokok;
    }

    // menghitung masa kerja pegawai
    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    // menampilkan informasi dasar pegawai
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT : " + tmt);
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
    }
}