/* Nama File    : Pengusaha.java
 * Deskripsi    : class untuk data Pengusaha yang mengimplementasikan Pajak
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 23 Maret 2026
 */

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(){
        // Konstruktor tanpa parameter
    }
    // Konstruktor dengan paramter
    public Pengusaha(String nama, String tgl, String alamat, double pendapatan, String npwp) {
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Mengambil jumlah total objek Pengusaha yang telah dibuat
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Menghitung masa kerja Pengusaha berdasarkan tahun mulai kerja dan digit NIM
    @Override
    public int hitungMasaKerja() {
        int tahunMulai = Integer.parseInt(tgl_mulai_kerja.substring(tgl_mulai_kerja.length() - 4));
        return (2026 - tahunMulai) + 6;
    }

    // Menghitung pajak Pengusaha sebesar 15% dari pendapatan
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // Menampilkan informasi Pengusaha 
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}