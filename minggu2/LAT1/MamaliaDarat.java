
//class main
public class MamaliaDarat {
    public static void main(String[] args) {

        String suaraHewan;

        System.out.println("\n DEMO KELAS, METHOD DAN DATA");
        System.out.println("--------------------------\n");

        //instansiasi
        Kucing pussy = new Kucing();
        suaraHewan = pussy.mengeong();
        System.out.println("Suara pussy = "+suaraHewan);

        Anjing doggy = new Anjing();
        suaraHewan = doggy.menggonggong();
        System.out.println("\nSuara doggy = "+suaraHewan);

        Macan siKumbang = new Macan();
        suaraHewan = siKumbang.mengaung();
        System.out.println("\nSuara si kumbang = "+suaraHewan+"\n");
        

    }

    
}   