public class Limas {
    private Persegi persegi;
    private SgtSamaSisi segitiga;

    public Limas(double Sx1, double Sy1, double Sx2, double Sy2, double Px1, double Py1, double Px2, double Py2){
        this.persegi = new Persegi(Px1, Py1, Px2, Py2);
        this.segitiga = new SgtSamaSisi(Sx1, Sy1, Sx2, Sy2);
    }

    public double hitungLuas(){
        double hasil;
        hasil = (this.persegi.hitungLuas() + (this.segitiga.hitungLuas()*3)); 
        return hasil;
    }

    public void tampil(){
        this.segitiga.tampil();
        System.out.println();
        this.persegi.tampil();
        System.out.println();
        System.out.println("Luas Limas \t:"+hitungLuas());
    }

    
}
