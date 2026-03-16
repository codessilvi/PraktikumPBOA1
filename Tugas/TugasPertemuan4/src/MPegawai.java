/* Nama File    : MPegawai.java
 * Deskripsi    : berisi main program untuk menguji class Pegawai
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 9 Maret 2026
 */

import java.time.LocalDate;

public class MPegawai {

    public static void main(String[] args) {

        // membuat objek dosen tetap
        DosenTetap dt = new DosenTetap(
                "9545647548",
                "Andi",
                LocalDate.of(1990, 5, 5),
                LocalDate.of(2015, 1, 1),
                5000000,
                "Fakultas Sains dan Matematika",
                "78647324"
        );

        // membuat objek dosen tamu
        DosenTamu dta = new DosenTamu(
                "123456789",
                "Budi",
                LocalDate.of(1985, 3, 10),
                LocalDate.of(2020, 2, 1),
                4500000,
                "Fakultas Teknik",
                "98765432",
                LocalDate.of(2027, 12, 31)
        );

        // membuat objek tendik
        Tendik t = new Tendik(
                "99887766",
                "Siti",
                LocalDate.of(1992, 7, 20),
                LocalDate.of(2018, 6, 1),
                4000000,
                "Akademik"
        );

        System.out.println("DATA DOSEN TETAP: ");
        dt.printInfo();

        System.out.println("\nDATA DOSEN TAMU: ");
        dta.printInfo();

        System.out.println("\nDATA TENDIK: ");
        t.printInfo();
    }
}