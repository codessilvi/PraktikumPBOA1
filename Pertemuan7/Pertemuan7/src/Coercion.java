/* Nama File    : Coercion.java
 * Deskripsi    : Polimorfisme coercion (konversi tipe data)
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 27 April 2026
 */

public class Coercion{
    public static void main(String[] args) {
        int x= 65;

        System.out.println("Integer: " + x);
        System.out.println("Char   : " + (char)x);
        System.out.println("Double : " + (double)x);

        double real = x;
        int kembali = (int) real;
        System.out.println("Kembali ke integer: " + kembali);

        String X = "1234";
        String Y = "5678";

        String S= X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("Konkatenasi: " + S);
        System.out.println("Penjumlahan: " + Z);

        String P ="12.34";
        String Q ="56.78";

        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("Konkatenasi double: " + R);
        System.out.println("Penjumlahan double: " + D);

        int A = Integer.parseInt(S);
        System.out.println("A: " + A);

        String T = Integer.toString(A);
        System.out.println("T: " + T);
    }
}