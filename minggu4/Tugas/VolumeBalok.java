/**
 * VolumeBalok
 */
public class VolumeBalok extends BangunRuang{

    private float panjang;
    private float alas;
    private float tinggi;

    VolumeBalok(float panjang, float alas, float tinggi){
        this.panjang = panjang;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    void volume(){
        float volume = this.panjang * this.alas * this.tinggi;
        System.out.println("\nMenghitung volume balok");
        System.out.println("panjang : "+ this.panjang);
        System.out.println("alas : "+ this.alas);
        System.out.println("tinggi : "+ this.tinggi);
        System.out.println("Volume : "+ volume);
    }

    
}