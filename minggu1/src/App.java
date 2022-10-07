class Mahasiswa{
    private String name;
    private String NIM;
    private String Prodi;

    Mahasiswa(String name, String NIM, String Prodi){
        this.name = name;
        this.NIM = NIM;
        this.Prodi = Prodi;
    }

    void showData(){
        System.out.println("\nnama : "+ this.name);
        System.out.println("NIM : "+ this.NIM);
        System.out.println("Prodi : "+ this.Prodi);
    }

    void reName(String gantiNama){
        this.name = gantiNama;
    }

    String getName(){
        return this.name;
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {

        Mahasiswa mhs1 = new Mahasiswa("nanda wijaya putra", "J0303211030", "Informatika");
        mhs1.showData();
        mhs1.reName("nanda ganteng");
        mhs1.showData();

    }
}
