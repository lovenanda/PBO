public class Bola extends Lingkaran {
    
    public Bola(double r){
        super(r);
    }

    @Override
    public void luas(){
        double luas = 4 * Math.PI * super.getR() * super.getR(); 
        System.out.println("Menghitung Luas Bola");
        System.out.println("Jari - Jari : "+super.getR());
        System.out.println("Luas : "+luas);
        System.out.println();
    }

    @Override
    public void keliling(){
        double keliling = 4/3 * Math.PI * super.getR() * super.getR(); 
        System.out.println("Menghitung Keliling Bola");
        System.out.println("Jari - Jari : "+super.getR());
        System.out.println("Keliling : "+keliling);
        System.out.println();
    }

    public void volume(){
        double volume = 4/3 * Math.PI * super.getR() * super.getR() * super.getR();
        System.out.println("Menghitung Volume Bola");
        System.out.println("Jari - Jari : "+super.getR());
        System.out.println("Volume : "+volume);
        System.out.println();
    }
}
