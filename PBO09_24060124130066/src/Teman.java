/* Nama File    : Teman.java
 * Deskripsi    : Kelas untuk mengelola koleksi nama teman
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 4 Mei 2026
 */

import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    // Konstruktor untuk membuat koleksi kosong
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // Mengambil jumlah elemen dalam koleksi
    public int getNbelm(){
        return nbelm;
    }

    // Mengambil nama berdasarkan indeks
    public String getNama(int indeks){
        if(indeks >= 0 && indeks < Lnama.size()){
            return Lnama.get(indeks);
        }
        return null;
    }

    // Mengubah nama pada indeks tertentu
    public void setNama(int indeks, String nama){
        if(indeks >= 0 && indeks < Lnama.size()){
            Lnama.set(indeks, nama);
        }
    }

    // Menambahkan nama ke dalam koleksi
    public void addNama(String nama){
        Lnama.add(nama);
        this.nbelm++;
    }

    // Menghapus nama dari koleksi
    public void delNama(String nama){
        if(Lnama.remove(nama)){
            this.nbelm--;
        }
    }

    // Menampilkan seluruh nama dalam koleksi
    public void showTeman(){
        System.out.println("Daftar teman :");

        for(String n : Lnama){
            System.out.println("- " + n);
        }
    }

    // Mengecek apakah nama terdapat dalam koleksi
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    // Mengganti nama lama menjadi nama baru
    public void gantiNama(String nama, String namabaru){
        int x = Lnama.indexOf(nama);

        if(x != -1){
            Lnama.set(x, namabaru);
        }
    }

    // Menghitung jumlah kemunculan nama tertentu
    public int countNama(String nama){
        int count = 0;

        for(String n : Lnama){
            if(n.equals(nama)){
                count++;
            }
        }

        return count;
    }
}