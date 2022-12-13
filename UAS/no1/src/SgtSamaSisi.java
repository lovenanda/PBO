public class SgtSamaSisi extends Titik {
    private double sisiSGT;

    public SgtSamaSisi(double x1, double y1, double x2, double y2){
        super(x1, y1);
        this.sisiSGT = hitungJarak(new Titik(x2, y2));
    }

    public double hitungLuas(){
        double luas;
        double tinggi;
        tinggi = Math.sqrt((this.sisiSGT * this.sisiSGT)-((this.sisiSGT/2) * (this.sisiSGT/2)));
        luas = this.sisiSGT * tinggi / 2;
        return luas;
    }

    public void tampil(){
        System.out.println("== DATA Segitiga ==");
        System.out.println("Sisi Segitiga \t:"+this.sisiSGT);
        System.out.println("Luas Segitiga \t:"+hitungLuas());
    }
    
}
