/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 2 Faret 2026
 */
public class Garis{
    /***************ATRIBUT*****************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor dengan titik awal (0,0) dan titik akhir (1,1)
    public Garis(){
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }
    
    // Konstruktor dengan titik awal dan titik akhir tertentu
    public Garis(Titik awal, Titik akhir){
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    // mengembalikan counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }
    // Mengembalikan nilai Titik Awal
    Titik getTitikAwal(){
        return titikAwal;
    }
    // Mengembalikan nilai Titik Akhir
    Titik getTitikAkhir(){
        return titikAkhir;
    }

    // Mengeset absis titik dengan nilai baru x
    void setTitikAwal(Titik T1) {
        titikAwal = T1;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setTitikAkhir(Titik T2) {
        titikAkhir = T2;
    }

    /***************METHOD*****************/
    // Menghitung  panjang garis
    double getPanjang(){
        return titikAwal.getJarak(titikAkhir);
    }

    // Menghitung gradien
    public double getGradien() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        if (x2 - x1 == 0) {
            return -99999; // asumsi nilai tidak terdefinisi
        }
        return (y2-y1)/(x2-x1);
    }

    // Menghitung titik tengah
    public Titik getTitikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;

        return new Titik(x, y);
    }

    // Boolean untuk mengetahui apakah suatu garis sejajar dengan garis lain
    // *dengan asumsi gradien terdefinisi
    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // boolean untuk mengecheck apakah sebuah garis tegak lurus dengan suatu titik lainnya
    // *dengan asumsi gradien terdefinisi
    boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }
   // Print garis
    public void printGaris() {
        System.out.print("Garis dari ");
        titikAwal.printTitik();
        System.out.print("ke ");
        titikAkhir.printTitik();
    }

    // Menampikan persamaan garis y = mx + c
    public void persamaanGaris(){
        double m = getGradien();
        double x = titikAwal.getAbsis();
        double y = titikAwal.getOrdinat();

        double c = y - (m*x);
        System.out.println("y = " + m + "x + " + c);
    }
}

