/* Nama File    : Asersi1.java
 * Deskripsi    : Program untuk menunjukkan asersi
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 30 Maret 2026
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0; 

        // Melakukan pengecekan apakah x lebih besar dari 0
        if (x > 0) { 
            System.out.println("x bilangan positif"); 
        } else {
            // Asersi untuk memastikan x kurang dari 0 saat di blok else
            assert (x < 0) : "ada kesalahan kode"; 
            System.out.println("x bilangan negatif");
        }
    }
}
