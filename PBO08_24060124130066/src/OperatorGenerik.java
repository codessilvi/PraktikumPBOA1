/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Kelas dengan prosedur generik Tukar
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Sabtu 2 Mei 2026
 */

/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Kelas dengan prosedur generik Tukar & fungsi Bobot2
 */

public class OperatorGenerik {

    // Tukar isi dua Datum
    public static <T> void Tukar(Datum<T> d1, Datum<T> d2) {
        T temp = d1.getIsi();
        d1.setIsi(d2.getIsi());
        d2.setIsi(temp);
    }

    // Fungsi generik Bobot2 (khusus turunan Kucing)
    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}