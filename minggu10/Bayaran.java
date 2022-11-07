public class Bayaran {
   
    public int hitungbayaran(Pegawai peg){
        int uang = peg.infoGaji();
        if (peg instanceof Manager){                  
            uang += ((Manager)peg).infoTunjangan();
        }else if (peg instanceof Programmer){
            uang += ((Programmer)peg).infoBonus();
        }
        return uang;
    }

    public static void main(String[] args) {
        Pegawai man = new Manager("Agus", 800, 50);
        Pegawai prog = new Programmer("budi", 600, 30);
        Bayaran hr = new Bayaran();

        System.out.println("Bayaran untuk Manager : "+ hr.hitungbayaran(man));
        System.out.println("Bayaran untuk Programer : "+ hr.hitungbayaran(prog));
    }
}
