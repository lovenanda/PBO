//class Main
public class MatematikaTest {
    public static void main(String[] args) {
        double a = 100, b = 3.0;
        double hasilJumlah, hasilKurang, hasilKali, hasilBagi;

        Matematika hitung = new Matematika();
        

        hasilJumlah = hitung.penjumlahan(a, b);
        hasilKurang = hitung.pengurangan(a, b);
        hasilKali = hitung.perkalian(a, b);
        hasilBagi = hitung.pembagian(a, b);

        System.out.println("\n=========== NOMER 2 ================");
        System.out.println("== PROGRAM DEMO OPERASI MATEMATIKA ==\n");
        

        System.out.println("hasil penjumlahan = "+hasilJumlah);
        System.out.println("hasil pengurangan = "+hasilKurang);
        System.out.println("hasil perkalian = "+hasilKali);
        System.out.println("hasil pembagian = "+hasilBagi);

        System.out.println("\n===================================");
    }
    
}
