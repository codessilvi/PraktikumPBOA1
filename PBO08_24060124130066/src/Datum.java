/* Nama File    : Datum.java
 * Deskripsi    : Kelas generik Datum
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Sabtu, 2 Mei 2026
 */

public class Datum<T> {
    private T isi;

    // Konstruktor
    public Datum(T isi) {
        this.isi = isi;
    }

    // Getter
    public T getIsi() {
        return isi;
    }

    // Setter
    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}