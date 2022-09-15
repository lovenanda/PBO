public class VolumeTabung extends BangunRuang{

    private float r; //jari jari 
    private float t; //Tinggi
    
    //construktor
    VolumeTabung(float r, float t){
        this.r = r;
        this.t = t;
    }

    @Override
    void volume(){
        float volume = (float)(Math.PI * r * r * t); //(22/7 *r *r *t)
        System.out.println("\nVolume Tabung");
        System.out.println("Jari Jari : "+this.r);
        System.out.println("Tinggi : "+this.t);
        System.out.println("Volume : "+volume);
    }
    
}
