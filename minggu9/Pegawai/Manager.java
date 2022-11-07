public class Manager extends Pegawai {
    private int tunjangan;

    public Manager(String name, int gaji, int tunjangan){
        super(name, gaji);
        this.tunjangan = tunjangan;
    }

    public int infoGaji(){
        return super.gaji;
    }

    public int infoTunjangan(){
        return this.tunjangan;
    }

    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }   
}
