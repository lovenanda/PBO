public class Pegawai {
    protected String name;
    protected int gaji;

    public Pegawai (String name, int gaji){
        this.name = name;
        this.gaji = gaji;
    }

    public int infoGaji(){
        return gaji;
    }
}
