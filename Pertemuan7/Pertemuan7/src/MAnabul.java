/* Nama File    : MAnabul.java
 * Deskripsi    : Program utama simulasi polimorfisme Anabul
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class MAnabul {
    public static void main(String[] args) {

        Anabul a1 = new Kucing("Oreo");
        Anabul a2 = new Anjing("Max");
        Anabul a3 = new Burung("Pipip");

        Anabul[] daftarAnabul = {a1, a2, a3};

        for (Anabul a : daftarAnabul) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}