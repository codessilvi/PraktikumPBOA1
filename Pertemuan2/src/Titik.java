/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 23 Februari 2026
 */


public class Titik {

    /***************ATRIBUT*****************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD*****************/

    // konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }
    // mengembalikan counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }
    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mengembalikan kuadran dari suatu titik
    int getKuadran() {
        if (getAbsis() > 0.0){
            if (getOrdinat() > 0.0){
                return 1;
            }
            else{
                return 4;
            }
        }
        else{ //absis < 0
            if (getOrdinat() > 0.0){
                return 2;
            }
            else{
                return 3;
            }
        } 
    }

    // mengembalikan jarak titik ke pusat (0,0)
    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }
    // mengembalikan jarak titik ke pusat(a,b)
    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow((T.getAbsis() - this.absis),2) + Math.pow((T.getOrdinat() - this.ordinat),2));
    }

    //mencari titik yang merupakan hasil refleksi terhadap X
    void refleksiX() {
        this.ordinat = -ordinat;
    }

    //mencari titik yang merupakan hasil refleksi terhadap y
    void refleksiY() {
        this.absis = -absis;
    }

    //mengembalikan titik yang merupakan hasil refleksi titik terhadap X
    Titik getRefleksiX(){
        Titik T = new Titik(getAbsis(),getOrdinat());
        T.refleksiX();
        return T;
    }
    //mengembalikan titik yang merupakan hasil refleksi titik terhadap Y
    Titik getRefleksiY(){
        Titik T = new Titik(getAbsis(),getOrdinat());
        T.refleksiY();
        return T;
    }
    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // mencetak counterTitik
    void printCounterTitik(){
        System.out.println(counterTitik);
    }

} // end class Titik
