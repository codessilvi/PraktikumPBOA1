/* Nama File    : DiskonLamda.java
 * Deskripsi    : Aplikasi lamda dasar
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 25 Mei 2026
 */

interface IDiskon{
    public double hitungDiskon(int harga);
} 

public class DiskonLambda {
    public static void main(String[] args){
        // tanpa menggunakan lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            } 
        };
        //dengan menggunakan lambda
        IDiskon diskonLebaran =(harga) -> harga - (harga * 0.4);
        // dengan lambda blok statement
        IDiskon diskonBiasa = harga -> {
            return harga - (harga*0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}