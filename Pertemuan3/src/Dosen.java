/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 2 Maret 2026
 */


public class Dosen {
    /****************************ATRIBUT*****************************/
    private String NIP;
    private String Nama;
    private String Prodi;

    /***************KONSTRUKTOR & SELEKTOR & MUTATOR*****************/

    public Dosen() {
        // konstruktor tanpa parameter (default)
    }

    //konstruktor dengan parameter nip, nama, prodi
    public Dosen(String nip, String nama, String prodi) {
        NIP = nip;
        Nama = nama;
        Prodi = prodi;
    }
    
    // mengembalikan string NIP
    public String getNIP() {
        return NIP;
    }

    // mengembalikan string Nama
    public String getNama() {
        return Nama;
    }

    // mengembalikan string prodi
    public String getProdi() {
        return Prodi;
    }
    
    // mengeset NIP dengan String baru nip
    public void setNIP(String nip) {
        NIP = nip;
    }

    // mengeset Nama dengan String baru nama
    public void setNama(String nama) {
        Nama = nama;
    }

    // mengeset Prodi dengan String baru prodi
    public void setProdi(String prodi) {
        Prodi = prodi;
    }

    // mencetak Dosen
    public void printDosen() {
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + Nama);
        System.out.println("Prodi : " + Prodi);
    }

}
