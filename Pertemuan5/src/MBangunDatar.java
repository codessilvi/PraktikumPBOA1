/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi main program untuk menguji class BangunDatar, Persegi, dan Lingkaran
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 23 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {

        Persegi p1 = new Persegi(4, "biru", "hitam");
        Lingkaran l1 = new Lingkaran(14, "pink", "hitam");

        BangunDatar p2 = new Persegi(10, "merah", "putih");
        BangunDatar l2 = new Lingkaran(20, "kuning", "abu");

        p1.printInfo();
        System.out.println("Luas: " + p1.getLuas());
        System.out.println("Keliling: " + p1.getKeliling());

        l1.printInfo();
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());

        p2.printInfo();
        System.out.println("Luas: " + p2.getLuas());

        l2.printInfo();
        System.out.println("Keliling: " + l2.getKeliling());

        p1.zoomIn();
        l1.zoomOut();

        System.out.println("Luas p1 setelah zoomIn: " + p1.getLuas());
        System.out.println("Luas l1 setelah zoomOut: " + l1.getLuas());

        System.out.println("Perbandingan luas: " + (p1.getLuas() == l1.getLuas()));
        System.out.println("Perbandingan keliling: " + (p2.getKeliling() == l2.getKeliling()));
    }
}