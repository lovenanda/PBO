public class VolumeBola extends BangunRuang {

    private float r;

    VolumeBola(float r){
        this.r = r;
    }

    @Override
    void volume(){
        float volume = (float)((4.0 / 3.0)* Math.PI * Math.pow(r, 3));
        System.out.println("\nMenghitung volume bola");
        System.out.println("Jari jari : "+ this.r);
        System.out.println("Volume : "+ volume);

    }
    
}
