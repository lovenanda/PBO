public class DemoMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Salman";
        mhs.nim = 1234;
        mhs.prodi = "Informatika";
        mhs.fakultas = "vokasi";
        mhs.semester = 3;
        mhs.ips = 4.0;
        mhs.ipk = 3.86;

        
    }
    
}

class Mahasiswa{
    String nama;
    int nim;
    String prodi;
    String fakultas;
    int semester;
    double ips;
    double ipk;


    public void IdentitasMhs(String nama, int nim, String prodi, String fakultas){
        System.out.println("\nIdentitas umum");
        System.out.println("Nama : "+this.nama);
        System.out.println("NIM : "+this.nim);
        System.out.println("Prodi : "+this.prodi);
        System.out.println("Fakultas : "+this.fakultas);


    }

    public void IdentitasMhs(String nama, int semester, int ips, int ipk){
        System.out.println("\nIdentitas umum");
        System.out.println("Nama : "+this.nama);
        System.out.println("Semester : "+this.semester);
        System.out.println("IPS : "+this.ips);
        System.out.println("IPK : "+this.ipk);


    }

    public void IdentitasMhs(){

    }
}
