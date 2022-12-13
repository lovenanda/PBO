public class Jurusan {
    private String kode;
    private String name;
    private Mahasiswa daftarMhs[];
    private int jumlahMhs;

    public Jurusan(String kode, String name){
        this.kode = kode;
        this.name = name;
    }

    public String getKode(){
        return this.kode;
    }

    public String getName(){
        return this.name;
    }

    public int getJumlahMhs(){
        return this.jumlahMhs;
    }

    public Mahasiswa[] getDaftarMahasiswas(){
        return this.daftarMhs;
    }

    public void addMahasiswa(Mahasiswa m){
        if (jumlahMhs < this.daftarMhs.length){
            this.daftarMhs[jumlahMhs] = m;
            jumlahMhs ++;
        }
    }
    
}
