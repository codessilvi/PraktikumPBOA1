/* Nama File    : LamdaList.java
 * Deskripsi    : Aplikasi lamda pada list
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 25 Mei 2026
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");
        // lambda sebagai parameter
        mahasiswaList.forEach((nama)->System.out.println(nama));
    }
}