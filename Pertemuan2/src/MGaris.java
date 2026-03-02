/* Nama File    : MGaris.java
 * Deskripsi    : berisi aplikasi method dalam class Garis
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 2 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {

        // Membuat beberapa titik
        Titik A = new Titik(0, 0);
        Titik B = new Titik(4, 4);
        Titik C = new Titik(0, 4);
        Titik D = new Titik(4, 0);

        // Membuat garis
        Garis G1 = new Garis(A, B);
        Garis G2 = new Garis(C, D);

        System.out.println("=== DATA GARIS ===");
        G1.printGaris();
        G2.printGaris();

        System.out.println("\n=== PANJANG GARIS ===");
        System.out.println("Panjang G1 = " + G1.getPanjang());
        System.out.println("Panjang G2 = " + G2.getPanjang());

        System.out.println("\n=== GRADIEN ===");
        System.out.println("Gradien G1 = " + G1.getGradien());
        System.out.println("Gradien G2 = " + G2.getGradien());

        System.out.println("\n=== TITIK TENGAH ===");
        Titik tengah = G1.getTitikTengah();
        System.out.print("Titik tengah G1 = ");
        tengah.printTitik();

        System.out.println("\n=== CEK HUBUNGAN ===");
        System.out.println("Apakah G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        System.out.println("\n=== PERSAMAAN GARIS ===");
        System.out.print("Persamaan G1: ");
        G1.persamaanGaris();

        System.out.print("Persamaan G2: ");
        G2.persamaanGaris();

        System.out.println("\nJumlah objek Garis = " + Garis.getCounterGaris());
    }
}