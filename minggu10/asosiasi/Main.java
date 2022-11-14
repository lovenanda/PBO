public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("6301090021");
        m1.setName("Dita Dwita");

        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("6301100190");
        m2.setName("Nukky");

        Dosen d = new Dosen();
        d.setKodeDosen("RBD");
        
        d.setNimMahasiswa(m1.getNim());
        d.setNimMahasiswa(m2.getNim());

        System.out.println("Kode Dosen: "+d.getKodeDosen());
        System.out.println("Mengajar Mahasiswa: ");

        int jum = d.getJumlahMhs();

        for(int i=0; i<jum; i++){
            System.out.println("\t- "+d.getNimMhs(i));
        }
    }
    
}
