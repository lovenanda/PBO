
public class Main {
    public static void main(String[] args) {


        //instansiasi balok
        BangunRuang balok1 = new VolumeBalok(10, 5, 2);
        BangunRuang balok2 = new VolumeBalok(10, 5, 3);

        //menampilkan hasil volume balok
        balok1.volume(); 
        balok2.volume();

        //instansiasi bola
        BangunRuang bola1 = new VolumeBola(28);
        BangunRuang bola2 = new VolumeBola(14);

        //menampilkan hasil volume bola
        bola1.volume(); 
        bola2.volume(); 

        //instansiasi kubus
        BangunRuang kubus1 = new VolumeKubus(20);
        BangunRuang kubus2 = new VolumeKubus(13);

        //menampilkan hasil volume kubus
        kubus1.volume();
        kubus2.volume();

        //instansiasi kerucut
        BangunRuang kerucut1 = new VolumeKerucut(5, 8);
        BangunRuang kerucut2 = new VolumeKerucut(8, 5);

        //menampilkan hasil volume kerucut
        kerucut1.volume();
        kerucut2.volume();

        //instansiasi limas
        BangunRuang limas1 = new VolumeLimas(10, 5, 15);
        BangunRuang limas2 = new VolumeLimas(8, 12, 5);

        //menampilkan hasil limas
        limas1.volume();
        limas2.volume();

        //instansiasi prisma
        BangunRuang prisma1 = new VolumePrisma(10, 12, 4);
        BangunRuang prisma2 = new VolumePrisma(8, 13, 7);

        //menampilkan hasil volume prisma
        prisma1.volume();
        prisma2.volume();

        //instansiasi tabung
        BangunRuang tabung1 = new VolumeTabung(14, 8);
        BangunRuang tabung2 = new VolumeTabung(18, 13);

        //menampilkan hasil volume tabung
        tabung1.volume();
        tabung2.volume();
    }
    
}
