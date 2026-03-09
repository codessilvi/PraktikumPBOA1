/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 2 Maret 2026
 */


public class MataKuliah {
    /****************************ATRIBUT*****************************/

    private String IDMatkul;
    private String Nama;
    private int SKS;

    /***************KONSTRUKTOR & SELEKTOR & MUTATOR*****************/


    public MataKuliah() {
        // konstruktor tanpa parameter (default)
    }

    public MataKuliah(String idmatkul, String nama, int sks) {
        IDMatkul = idmatkul;
        Nama = nama;
        SKS = sks;
    }
    // mengembalikan string IDMatkul
    public String getIDMatkul() {
        return IDMatkul;
    }

    // mengembalikan string Nama
    public String getNama() {
        return Nama;
    }

    // mengembalikan string SKS
    public int getSKS() {
        return SKS;
    }
    
    // mengeset IDMatkul dengan String baru idmatkul
    public void setIDMatkul(String idmatkul) {
        IDMatkul = idmatkul;
    }

    // mengeset Nama dengan String baru nama
    public void setNama(String nama) {
        Nama = nama;
    }

    // mengeset SKS dengan String baru sks
    public void setSKS(int sks) {
        SKS = sks;
    }

    // mencetak MataKuliah
    public void printMataKuliah() {
        System.out.println("IDMatkul : " + IDMatkul);
        System.out.println("Nama : " + Nama);
        System.out.println("SKS : " + SKS);
    }

}

