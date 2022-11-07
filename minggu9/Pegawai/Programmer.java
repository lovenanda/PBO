public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String name, int gaji, int bonus){
        super(name, gaji);
        this.bonus = bonus;
    }

    public int infoGaji(){
        return super.gaji; 
    }

    public int infoBonus(){
        return this.bonus;
    }

    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    
}
