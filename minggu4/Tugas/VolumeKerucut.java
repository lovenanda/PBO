public class VolumeKerucut extends BangunRuang{
    private float r; //jari jari
    private float t; //tinggi

    //constructor
    VolumeKerucut(float r, float t){
        this.r = r;
        this.t = t;
    }

    @Override
    void volume(){
        float volume = (float)( 1.0/3.0 * Math.PI * r * r * t); //(1/3*22/7*2^2*t)
        System.out.println("\nVolume Kerucut");
        System.out.println("Jari Jari : "+this.r);
        System.out.println("Tinggi : "+this.t);
        System.out.println("Volume "+volume);

        

    }
    
}
