/* Nama File    : Manusia.java
 * Deskripsi    : abstract class untuk data manusia secara umum
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 23 Maret 2026
 */

public abstract class Manusia {
    protected String nama;
    protected String tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(){
        // Konstruktor tanpa Parameter
    }
    
    // Konstruktor dengan parameter
    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // getter jumlah total objek Manusia yang telah dibuat
    public static int getCounterMns() {
        return counterMns;
    }

    // setter alamat manusia
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method abstrak untuk menghitung masa kerja
    public abstract int hitungMasaKerja();

    // Mencetak informasi manusia
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}