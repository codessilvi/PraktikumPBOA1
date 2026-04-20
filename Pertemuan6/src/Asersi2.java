/* Nama File    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, menolak input jari-jari bernilai nol
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 13 April 2026
 */

// Class Lingkaran
class Lingkaran { 
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// Class Asersi2 
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0; 

        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*             PERTANYAAN                */
/*secara konsep, ada yang kurang tepat pada program Asersi2 di atas. Jelaskan! */

/*               JAWABAN                */
/* Secara konsep, penggunaan asersi di program Asersi2 ini kurang tepat karena
    asersi seharusnya dipakai untuk mengecek kondisi internal program (biasanya debugging),
    bukan untuk validasi input seperti nilai jariJari dari luar.
    Pada kasus ini, pengecekan jariJari > 0 lebih cocok menggunakan if atau exception, bukan asersi,
    karena asersi bisa saja tidak aktif saat program dijalankan.
 */