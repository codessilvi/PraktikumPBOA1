/* Nama File    : MAnabul.java
 * Deskripsi    : Program utama untuk menguji kelas Anabul, Datum, OperatorGenerik, dan Data
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Sabtu, 2 Mei 2026
 */


public class MAnabul {
    public static void main(String[] args) {

        // 1. ANABUL (Kucing & turunannya)
        System.out.println("=== NO 1: ANABUL ===");

        Anggora anggora = new Anggora("mimi", 3.5);
        KembangTelon kembang = new KembangTelon("tata", 4.2);

        anggora.gerak();
        anggora.bersuara();
        System.out.println("Bobot: " + anggora.getBobot() + " kg");

        kembang.gerak();
        kembang.bersuara();
        System.out.println("Bobot: " + kembang.getBobot() + " kg");


        // 2. GENERIK DATUM
        System.out.println("\n=== NO 2: GENERIK DATUM ===");

        Datum<Anggora> datumAnggora = new Datum<>(anggora);

        System.out.println("Sebelum setIsi:");
        datumAnggora.getIsi().bersuara();

        datumAnggora.setIsi(new Anggora("opi", 2.8));

        System.out.println("Setelah setIsi:");
        datumAnggora.getIsi().bersuara();


        // 3a & 3b: TUKAR GENERIK
        System.out.println("\n=== NO 3: TUKAR GENERIK ===");

        // Integer
        Datum<Integer> dInt1 = new Datum<>(3);
        Datum<Integer> dInt2 = new Datum<>(6);

        System.out.println("Sebelum Tukar Integer:");
        System.out.println(dInt1.getIsi() + " " + dInt2.getIsi());

        OperatorGenerik.Tukar(dInt1, dInt2);

        System.out.println("Setelah Tukar Integer:");
        System.out.println(dInt1.getIsi() + " " + dInt2.getIsi());


        // String
        Datum<String> dStr1 = new Datum<>("Silvani");
        Datum<String> dStr2 = new Datum<>("Salsabilla");

        System.out.println("\nSebelum Tukar String:");
        System.out.println(dStr1.getIsi() + " " + dStr2.getIsi());

        OperatorGenerik.Tukar(dStr1, dStr2);

        System.out.println("Setelah Tukar String:");
        System.out.println(dStr1.getIsi() + " " + dStr2.getIsi());


        // Anabul
        Datum<Anabul> dA1 = new Datum<>(new Anggora("milky", 3.0));
        Datum<Anabul> dA2 = new Datum<>(new KembangTelon("noupel", 4.5));

        System.out.println("\nSebelum Tukar Anabul:");
        dA1.getIsi().bersuara();
        dA2.getIsi().bersuara();

        OperatorGenerik.Tukar(dA1, dA2);

        System.out.println("Setelah Tukar Anabul:");
        dA1.getIsi().bersuara();
        dA2.getIsi().bersuara();


        // 3c: BOBOT2
        System.out.println("\n=== NO 3c: BOBOT2 ===");

        Anggora a1 = new Anggora("opi", 3.0);
        Anggora a2 = new Anggora("oreo", 2.5);

        double total1 = OperatorGenerik.Bobot2(a1, a2);
        System.out.println("Total bobot Anggora: " + total1 + " kg");

        KembangTelon k1 = new KembangTelon("noupel", 4.0);
        double total2 = OperatorGenerik.Bobot2(a1, k1);
        System.out.println("Total bobot campuran: " + total2 + " kg");


        // 4. LARIK GENERIK
        System.out.println("\n=== NO 4: DATA (LARIK GENERIK) ===");

        Data<Anabul> dataAnabul = new Data<>();

        // setIsi
        dataAnabul.setIsi(1, new Anggora("mimi", 3.5));
        dataAnabul.setIsi(2, new KembangTelon("tata", 4.2));
        dataAnabul.setIsi(3, new Anggora("opi", 2.8));

        // getIsi
        System.out.println("Isi posisi 1:");
        dataAnabul.getIsi(1).bersuara();

        System.out.println("Isi posisi 2:");
        dataAnabul.getIsi(2).bersuara();

        System.out.println("Isi posisi 3:");
        dataAnabul.getIsi(3).bersuara();

        // getSize
        System.out.println("\nJumlah elemen efektif:");
        System.out.println(dataAnabul.getSize());
    }
}


// RENUNGAN

// Setlah mempraktikkan generik pada Java, menurut saya konsep generik digunakan
//  untuk membuat class atau method yng lebih fleksibel karena dapat menangani 
//  berbagai tipe data tanpa perlu membuat kode yang berulang. Dengan generik,
//  kita bisa menggunakan satu sturktur yang sama untuk tipe data yang berbeda,
//  seperti Integer, String, maupun objek seperti Anabul. Selain itu, generik
//  juga tetap menjaga keamanan tipe data, sehingga penggunaan data menjadi lebih
//  terkontrol. Meskipun ada beberapa bagian yang cukup tricky, seperti penggunaan
//  array pada generik, secara keseluruhan konsep ini membantu membuat kode menjadi
//  lebih rapi, efisien, dan mudah digunakan kembali.
