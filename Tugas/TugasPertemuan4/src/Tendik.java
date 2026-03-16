/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 9 Maret 2026
 */

import java.time.LocalDate;

public class Tendik extends Pegawai {

    private String bidang;
    private final int BUP = 55;

    // konstruktor tanpa parameter
    public Tendik(){

    }

    // konstruktor dengan parameter
    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang){

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    // mengambil bidang kerja tendik
    public String getBidang(){
        return bidang;
    }

    // mengubah bidang kerja tendik
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    // menghitung tunjangan tendik
    public double getTunjangan(){
        int masaKerja = getMasaKerja().getYears();
        return 0.01 * masaKerja * getGajiPokok();
    }

    // menampilkan informasi tendik
    public void printInfo(){
        super.printInfo();
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("BUP : " + BUP + " tahun");
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}