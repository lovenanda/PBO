package minggu4.BangunDatarLatihan;

public class Main {
    public static void main(String[] args) {

        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();

        persegi.sisi = 10;

        persegi.luas();
        persegi.keliling();

        lingkaran.r = 14;
        System.out.println("\n ");
        lingkaran.keliling();
        lingkaran.luas();
        
    }
    
}
