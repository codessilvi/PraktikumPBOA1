/* Nama File    : MTitik.java
 * Deskripsi    : Berisi aplikasi method dalam class Titik
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 23 Februari 2026
 */

public class MTitik {
    public static void main(String[] args){

        // Membuat titik T1 (0,0)
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.print("T1 awal : ");
        T1.printTitik();

        // Uji jarak ke pusat
        System.out.println("Jarak T1 ke pusat = " + T1.getJarakPusat());

        // Uji kuadran
        System.out.println("Kuadran T1 = " + T1.getKuadran());

        // Uji geser
        T1.geser(2, -1);
        System.out.print("T1 setelah digeser (2,-1) : ");
        T1.printTitik();

        // Uji refleksi X (mengubah objek asli)
        T1.refleksiX();
        System.out.print("T1 setelah refleksi X : ");
        T1.printTitik();

        // ===============================
        // Membuat titik T2
        Titik T2 = new Titik();
        T2.setAbsis(3);
        T2.setOrdinat(5);
        System.out.print("T2 : ");
        T2.printTitik();

        // Uji jarak T1 ke T2
        System.out.println("Jarak T1 ke T2 = " + T1.getJarak(T2));

        // ===============================
        // Uji getRefleksiX (objek baru)
        Titik T3 = T2.getRefleksiX();
        System.out.print("Refleksi X dari T2 (T3) : ");
        T3.printTitik();

        // Uji getRefleksiY (objek baru)
        Titik T4 = T2.getRefleksiY();
        System.out.print("Refleksi Y dari T2 (T4) : ");
        T4.printTitik();

        // ===============================
        // Menampilkan jumlah objek
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
    }
}