
public class Main {
    public static void main(String[] args) {

        BangunRuang balok1 = new VolumeBalok(10, 5, 2);
        BangunRuang balok2 = new VolumeBalok(10, 5, 3);
        balok1.volume();
        balok2.volume();

        BangunRuang bola1 = new VolumeBola(28);
        BangunRuang bola2 = new VolumeBola(14);
        bola1.volume(); 
        bola2.volume(); 

        BangunRuang kubus1 = new VolumeKubus(20);
        BangunRuang kubus2 = new VolumeKubus(13);
        kubus1.volume();
        kubus2.volume();
        
    }
    
}
