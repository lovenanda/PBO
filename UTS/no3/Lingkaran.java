
public class Lingkaran {

    private double r;

    public Lingkaran(double r){
        this.r = r;
    }

    public double getR(){
        return this.r;
    }

    public void luas(){
        double luas = Math.PI * r * r;
        System.out.println("Menghitung Keliling Lingkaran");
        System.out.println("Jari - Jari : "+this.r);
        System.out.println("Luas : "+luas);
        System.out.println();
    }
    
    public void keliling(){
        double keliling = 2 * Math.PI * r;
        System.out.println("Mengkitung Luas Lingkaran");
        System.out.println("Jari - Jari : "+this.r);
        System.out.println("Keliling : "+keliling);
        System.out.println();
    }
    
}