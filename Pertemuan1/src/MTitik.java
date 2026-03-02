/* Nama File    : MTitik.java
 * Deskripsi    : berisi aplikasi method dalam class Titik
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Kamis, 19 Februari 2026
 */
public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik(); //Membuat titik T1 (0,0)
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
    }
}
