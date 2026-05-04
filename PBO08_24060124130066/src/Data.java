/* Nama File    : Data.java
 * Deskripsi    : Kelas generik dengan larik statik 100 elemen
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Sabtu, 2 Mei 2026
 */

public class Data<T> {

    // Atribut
    private Object[] ruang; // pakai Object biar simpel
    private int banyak;

    // Konstruktor
    public Data() {
        ruang = new Object[100];
        banyak = 0;
    }

    // setIsi: mengisi elemen pada posisi tertentu (1..100)
    public void setIsi(int posisi, T nilai) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null) {
                banyak++; // hanya tambah kalau sebelumnya kosong
            }
            ruang[posisi - 1] = nilai;
        } else {
            System.out.println("Posisi harus 1..100");
        }
    }
    // getIsi: mengambil elemen pada posisi tertentu
    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
    if (posisi >= 1 && posisi <= 100) {
        if (ruang[posisi - 1] != null) {
            return (T) ruang[posisi - 1];
        } else {
            System.out.println("Data di posisi tersebut kosong");
            return null;
        }
    } else {
        System.out.println("Posisi harus 1..100");
        return null;
    }
}

    // getSize: jumlah elemen efektif
    public int getSize() {
        return banyak;
    }
}