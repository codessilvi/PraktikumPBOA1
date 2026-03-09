/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 2 Maret 2026
 */


public class Kendaraan {
    /****************************ATRIBUT*****************************/

    private String NoPlat;
    private String Jenis;

    /***************KONSTRUKTOR & SELEKTOR & MUTATOR*****************/


    public Kendaraan() {
        // konstruktor tanpa parameter (default)
    }

    public Kendaraan(String noplat, String jenis) {
        NoPlat = noplat;
        Jenis = jenis;
    }
    // mengembalikan string NoPlat
    public String getNoPlat() {
        return NoPlat;
    }

    // mengembalikan string Jenis
    public String getJenis() {
        return Jenis;
    }
    
    // mengeset NoPlat dengan String baru noplat
    public void setNoPlat(String noplat) {
        NoPlat = noplat;
    }

    // mengeset Jenis dengan String baru jenis
    public void setJenis(String jenis) {
        Jenis = jenis;
    }


    // mencetak Kendaraan
    public void printKendaraan() {
        System.out.println("NoPlat : " + NoPlat);
        System.out.println("Jenis : " + Jenis);
    }

}

