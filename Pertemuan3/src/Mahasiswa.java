/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 2 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {

    /****************************ATRIBUT*****************************/
    private String NIM;
    private String Nama;
    private String Prodi;
    private ArrayList<MataKuliah> ListMatKul;
    private Dosen DosenWali;
    private Kendaraan kendaraan;

    /***************KONSTRUKTOR*****************/

    // konstruktor tanpa parameter
    public Mahasiswa() {
        ListMatKul = new ArrayList<>();
    }

    // konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.NIM = nim;
        this.Nama = nama;
        this.Prodi = prodi;
        ListMatKul = new ArrayList<>();
    }

    /***************SELEKTOR*****************/
    // mengembalikan String NIM
    public String getNIM() {
        return NIM;
    }

    // mengembalikan String Nama
    public String getNama() {
        return Nama;
    }
    // mengembalikan String Prodi
    public String getProdi() {
        return Prodi;
    }

    // mengembalikan Array List Matkul
    public ArrayList<MataKuliah> getListMatKul() {
        return ListMatKul;
    }

    // mengembalikan String Dosen Wali
    public Dosen getDosenWali() {
        return DosenWali;
    }

    // mengembalikan String kendaraan
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    /***************MUTATOR*****************/

    // mengeset NIM dengan String baru nim
    public void setNIM(String nim) {
        NIM = nim;
    }

    // mengeset Nama dengan String baru nama
    public void setNama(String nama) {
        Nama = nama;
    }

    // mengeset Prodi dengan String baru prodi
    public void setProdi(String prodi) {
        Prodi = prodi;
    }

    // mengeset DosenWali dengan Dosen baru dosenwali
    public void setDosenWali(Dosen dosenwali) {
        DosenWali = dosenwali;
    }

    // mengeset kendaraan dengan Kendaraan baru kendaraaN
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    /***************METHOD*****************/

    // menambahkan mata kuliah
    public void addMatKul(MataKuliah newMatKul) {
        ListMatKul.add(newMatKul);
    }

    // mendapatkan jumlah mata kuliah
    public int getJumlahMatKul() {
        return ListMatKul.size();
    }

    // mendapatkan jumlah SKS
    public int getJumlahSKS() {
        int total = 0;

        for (int i = 0; i < ListMatKul.size(); i++) {
            total += ListMatKul.get(i).getSKS();
        }

        return total;
    }

    // mencetak data mahasiswa
    public void printMhs() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Prodi : " + Prodi);
    }

    // mencetak detail mahasiswa
    public void printDetailMhs() {

        printMhs();

        System.out.println("Dosen Wali : " + DosenWali.getNama());

        if (kendaraan != null) {
            kendaraan.printKendaraan();
        }

        System.out.println("Daftar Mata Kuliah :");

        for (int i = 0; i < ListMatKul.size(); i++) {
            System.out.println("- " + ListMatKul.get(i).getNama());
        }
    }
}