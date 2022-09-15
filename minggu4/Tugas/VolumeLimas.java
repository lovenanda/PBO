public class VolumeLimas extends BangunRuang{

    private float p; //panjang
    private float l; //lebar
    private float t; //tinggi

    //constructor
    VolumeLimas(float p, float l, float t){
        this.p = p; 
        this.l = l;
        this.t = t;
    }

    @Override
    void volume(){
        float volume = (this.p * this.l * this.t / 3); //(p*l*t/3)
        System.out.println("\nVolume Limas");
        System.out.println("Panjang : "+this.p);
        System.out.println("Lebar : "+this.l);
        System.out.println("Tinggi : "+this.t);
        System.out.println("Volume : "+volume);
    }
    
}
