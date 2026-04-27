/* Nama File    : MMahasiswa.java
 * Deskripsi    : Program utama untuk menguji overloading class Mahasiswa
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {

        // Konstruktor tanpa parameter
        Mahasiswa m1= new Mahasiswa();

        // Konstruktor 3 parameter
        Mahasiswa m2 =new Mahasiswa("24060124130066", "Silvani Salsabilla", "Informatika");

        // Konstruktor copy
        Mahasiswa m3 =new Mahasiswa(m2);

        // Overloading method setProgramStudi()
        m1.setProgramStudi(); // tanpa parameter
        m2.setProgramStudi("IF"); // parameter String
        m3.setProgramStudi(m2); // parameter objek Mahasiswa

        // Menampilkan data
        System.out.println("Data Mahasiswa 1");
        m1.printInfo();

        System.out.println("Data Mahasiswa 2");
        m2.printInfo();

        System.out.println("Data Mahasiswa 3");
        m3.printInfo();
    }
}