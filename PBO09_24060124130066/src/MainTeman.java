/* Nama File    : MainTeman.java
 * Deskripsi    : Aplikasi penggunaan kelas Teman
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 4 Mei 2026
 */

public class MainTeman{
    public static void main(String[] args){

        // Membuat objek Teman
        Teman t = new Teman();

        // Menambahkan nama ke koleksi
        t.addNama("noupel");
        t.addNama("opi");
        t.addNama("legarsi");

        // Menampilkan jumlah teman
        System.out.println("Jumlah teman : " + t.getNbelm());

        // Menampilkan nama pada indeks pertama
        System.out.println("\nNama pertama : " + t.getNama(0));

        // Mengubah nama pada indeks pertama
        t.setNama(0, "silvani");

        // Menampilkan koleksi terbaru
        System.out.println("\nKoleksi terbaru : ");
        t.showTeman();

        // Menghapus nama dari koleksi
        t.delNama("legarsi");

        // Menampilkan koleksi setelah penghapusan
        System.out.println("\nSetelah penghapusan : ");
        t.showTeman();

        // Mengecek apakah nama tertentu ada dalam koleksi
        System.out.println("\nApakah Legarsih member? "
                + t.isMember("Legarsih"));

        // Mengganti nama tertentu
        t.gantiNama("silvani", "cipi");

        // Menampilkan koleksi setelah penggantian nama
        System.out.println("\nSetelah ganti nama : ");
        t.showTeman();

        // Menghitung jumlah kemunculan nama tertentu
        System.out.println("\nJumlah nama cipi : "
                + t.countNama("cipi"));
    }
}