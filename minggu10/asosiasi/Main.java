public class Main {
    public static void main(String[] args) {

        //Membuat objek mahasiswa 1
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("6301090021");
        m1.setName("Dita Dwita");
        
        //Membuat objek mahasiswa 2
        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("6301100190");
        m2.setName("Nukky");

        //Membuat objek Dosen
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

        // Membuat Objek Mahasiswa
        Jurusan j = new Jurusan("INF", "Manajement Informatika");

        //membuat objek mahasiswa 3
        Mahasiswa m3 = new Mahasiswa();
        m3.setName("Mandra");
        m3.setNim("987987");
        
        Mahasiswa m4 = new Mahasiswa();
        m4.setName("Abdul");
        m4.setNim("987542");

        j.addMahasiswa(m3);
        j.addMahasiswa(m4);

        Mahasiswa[] daftar = j.getDaftarMahasiswas();
        int jumlahDaftar = j.getJumlahMhs();

        for(int i=0; i<jumlahDaftar; i++){
            System.out.println("Nama\t: "+daftar[i].getName());
            System.out.println("Nim\t: "+daftar[i].getNim());
        }



    }
    
}
