/* Nama File    : MainPiaraan.java
 * Deskripsi    : Aplikasi penggunaan kelas Piaraan
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 10 Mei 2026
 */

public class MainPiaraan {
    public static void main(String[] args) {

        // Membuat objek Piaraan
        Piaraan p = new Piaraan();

        // Membuat objek Anabul
        Kucing k1 = new Kucing("milo");
        Kucing k2 = new Kucing("oyen");
        Anjing a1 = new Anjing("kawka");
        Burung b1 = new Burung("cilo");

        // Menambahkan Anabul ke antrean
        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);

        // Menampilkan seluruh Anabul
        p.showAnabul();

        // Menampilkan jumlah elemen antrean
        System.out.println("\nJumlah Anabul : "
                + p.getNbelm());

        // Menampilkan elemen pertama antrean
        System.out.println("\nAnabul terdepan : "
                + p.getAnabul().getNama());

        // Menghapus elemen pertama antrean
        p.dequeueAnabul();

        // Menampilkan antrean setelah dequeue
        System.out.println("\nSetelah dequeue :");
        p.showAnabul();

        // Menghitung jumlah kucing
        System.out.println("\nJumlah kucing : "
                + p.countKucing());

        // Menghitung total bobot kucing
        System.out.println("Total bobot kucing : "
                + p.bobotKucing());

        // Menampilkan jenis objek setiap Anabul
        System.out.println();
        p.showJenisAnabul();
    }
}

// Konsep koleksi pada Java digunakan untuk menyimpan dan mengelola sekumpulan data atau objek dalam satu
// wadah secara terstruktur. Dengan koleksi, data dapat ditambahkan, dihapus, dicari, diubah, maupun 
// ditampilkan kembali dengan lebih mudah dan efisien dibandingkan menggunakan variabel satu per satu.

// Pada praktikum ini, koleksi bekerja dengan memanfaatkan kelas dari package java.util, seperti List dan 
// Queue. List digunakan untuk menyimpan data secara berurutan dan dapat diakses menggunakan indeks, 
// sedangkan Queue digunakan untuk antrean dengan prinsip FIFO (First In First Out), yaitu data yang
// masuk lebih dulu akan keluar lebih dulu.

// Konsep koleksi juga mendukung penyimpanan objek dari suatu kelas, sehingga objek dapat dikelola dalam 
// jumlah banyak secara dinamis. Selain itu, koleksi mempermudah penerapan konsep OOP seperti inheritance 
// dan polymorphism, karena satu koleksi dapat menyimpan berbagai objek turunan dari kelas induk yang sama.