/* Nama File    : Petani.java
 * Deskripsi    : class untuk data Petani yang mengimplementasikan Pajak
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 23 Maret 2026
 */

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(){
        //Konstruktor tanpa parameter
    }
    // Konstruktor dengan parameter
    public Petani(String nama, String tgl, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Mengambil jumlah total objek Petani yang telah dibuat
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Menghitung masa kerja Petani berdasarkan tahun mulai kerja dan digit NIM
    @Override
    public int hitungMasaKerja() {
        int tahunMulai = Integer.parseInt(tgl_mulai_kerja.substring(tgl_mulai_kerja.length() - 4));
        return (2026 - tahunMulai) + 0;
    }

    // Menghitung pajak Petani (0)
    @Override
    public double hitungPajak() {
        return 0;
    }

    // Menampilkan informasi Petani
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}