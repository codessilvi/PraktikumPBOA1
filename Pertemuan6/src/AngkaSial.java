/* Nama File    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 13 April 2026
 */

public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException { 
        if (angka == 13) {
            throw new AngkaSialException(); 
        }
        System.out.println(angka + " bukan angka sial"); 
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial(); 
        
        try {
            as.cobaAngka(10); 
            as.cobaAngka(13); 
            as.cobaAngka(12); 
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage()); 
            System.out.println("hati-hati memasukkan angka!!!"); 
        }
    }
}

/*             PERTANYAAN                */
/*A. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
* B. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
    Jelaskan! */

/*               JAWABAN                */
/* A. Tidak, ketika eksepsi terjadi saat as.cobaAngka(13),
        maka baris ke-12 (System.out.println(angka + " bukan angka sial");) 
        tidak akan dieksekusi karena proses langsung terhenti di method tersebut 
        dan berpindah ke blok catch.

        
/* B. Ya, baris ke-21 (catch (AngkaSialException ase)) akan dieksekusi karena setelah eksepsi dilempar,
        program langsung masuk ke blok catch untuk menangani error tersebut,
        sehingga perintah di dalam catch akan dijalankan. */