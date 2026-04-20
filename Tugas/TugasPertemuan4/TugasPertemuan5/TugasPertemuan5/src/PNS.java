/* Nama File    : PNS.java
 * Deskripsi    : class untuk data PNS yang mengimplementasikan Pajak
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 23 Maret 2026
 */

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(){
        // Konstruktor tanpa parameter
    }
    // Konstruktor dengan parameter
    public PNS(String nama, String tgl, String alamat, double pendapatan, String nip) {
        super(nama, tgl, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Mengambil jumlah total objek PNS yang telah dibuat
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Menghitung masa kerja PNS berdasarkan tahun mulai kerja dan digit NIM 
    @Override
    public int hitungMasaKerja() {
        int tahunMulai = Integer.parseInt(tgl_mulai_kerja.substring(tgl_mulai_kerja.length() - 4));
        return (2026 - tahunMulai) + 6;
    }

    // Menghitung pajak PNS sebesar 10% dari pendapatan
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    // Menampilkan informasi PNS
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}