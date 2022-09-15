public class VolumeKubus extends BangunRuang {

    private float sisi; //sisi


    //constructor
    VolumeKubus(float sisi){
        this.sisi = sisi;
    }

    @Override
    void volume(){
    float volume = (float) Math.pow(this.sisi, 3) ; //(S^3)
        System.out.println("\nMenghitung volume kubus");
        System.out.println("Sisi : "+ this.sisi);
        System.out.println("Volume : "+ volume);
    }

    
}
