public class VolumeKubus extends BangunRuang {

    private float sisi;

    VolumeKubus(float sisi){
        this.sisi = sisi;
    }

    @Override
    void volume(){
    float volume = (float) Math.pow(sisi, 3) ;
        System.out.println("\nMenghitung volume kubus");
        System.out.println("Sisi : "+ this.sisi);
        System.out.println("Volume : "+ volume);
    }

    
}
