/* Nama File    : LamdaCollect.java
 * Deskripsi    : Aplikasi lamda pada koleksi map 
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 25 Mei 2026
 */

import java.util.HashMap;
import java.util.Map;

public class LamdaCollect {
    public static void main(String[] args) {
        Map<String, String> mapmahasiswa = new HashMap<>();
        // Map put map mahasiswa
        mapmahasiswa.put("24060124130066", "Adi");
        mapmahasiswa.put("24060124130060", "Cici");
        mapmahasiswa.put("24060124130069", "Bambang");
        mapmahasiswa.put("24060124130065", "siapayasatulagi");
        // Output dengan lamda
        mapmahasiswa.forEach((nim,nama)-> {System.out.println("Nim " + nim);
                                            System.out.println("Nama " + nama);
                                            System.out.println();
                                        });
    }
}
