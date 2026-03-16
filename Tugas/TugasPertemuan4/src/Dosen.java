/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 9 Maret 2026
 */
import java.time.LocalDate;

public class Dosen extends Pegawai {

    protected String fakultas;

    // konstruktor tanpa parameter
    public Dosen() {

    }

    // konstruktor dengan parameter
    public Dosen(String nip, String nama, LocalDate tanggalLahir, 
                LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // mengambil fakultas tempat dosen bekerja
    public String getFakultas() {
        return fakultas;
    }

    // mengubah fakultas dosen
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // menampilkan informasi dosen
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas : " + fakultas);
    }
}