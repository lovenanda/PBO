public class Persegi extends Titik {

    private double sisiPSG;

    public Persegi(double x1, double y1, double x2, double y2){
        super(x1, y1);
        this.sisiPSG = hitungJarak(new Titik(x2, y2));
    }

    public double hitungLuas(){
        double luas;
        luas = this.sisiPSG * this.sisiPSG;
        return luas;
    }

    public void tampil(){
        System.out.println("== DATA Persegi ==");
        //System.out.println("POIN \t\t:"+ this.);
        System.out.println("Sisi Persegi \t:"+this.sisiPSG);
        System.out.println("Luas Persegi \t:"+hitungLuas());
    }
    
}
