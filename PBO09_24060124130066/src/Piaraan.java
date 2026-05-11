/* Nama File    : Piaraan.java
 * Deskripsi    : Kelas koleksi antrean objek Anabul
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 4 April 2026
 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    // Konstruktor untuk membuat antrean kosong
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // Mengambil jumlah elemen antrean
    public int getNbelm() {
        return nbelm;
    }

    // Menambahkan Anabul ke antrean
    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm++;
    }

    // Mengecek apakah Anabul terdapat dalam antrean
    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    // Mengambil elemen pertama antrean
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // Mengambil sekaligus menghapus elemen pertama antrean
    public Anabul dequeueAnabul() {
        if(!Lanabul.isEmpty()) {
            nbelm--;
        }
        return Lanabul.poll();
    }

    // Menampilkan semua nama Anabul dalam antrean
    public void showAnabul() {
        System.out.println("Daftar Anabul :");

        for(Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    // Menghitung jumlah objek Kucing
    public int countKucing() {
        int count = 0;

        for(Anabul a : Lanabul) {
            if(a instanceof Kucing) {
                count++;
            }
        }

        return count;
    }

    // Menghitung total bobot semua Kucing
    public int bobotKucing() {
        int total = 0;

        for(Anabul a : Lanabul) {
            if(a instanceof Kucing) {
                total += a.getBobot();
            }
        }

        return total;
    }

    // Menampilkan nama dan jenis objek Anabul
    public void showJenisAnabul() {
        System.out.println("Jenis Anabul :");

        for(Anabul a : Lanabul) {
            System.out.println(
                a.getNama() + " -> " +
                a.getClass().getName()
            );
        }
    }
}