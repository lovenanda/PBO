package minggu4.BangunDatarLatihan;

public class Lingkaran extends BangunDatar {
    public float r;

    @Override
    float luas(){
        float luas = (Math.PI * r);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = r*r;
        return keliling;
    }
    
}
