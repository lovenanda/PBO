package minggu4.BangunDatarLatihan;

public class Persegi extends BangunDatar{
    public float sisi;

    @Override
    float luas(){
        float luas = sisi*sisi;
        System.out.println("Luas persegi "+luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = 4*sisi;
        System.out.println("Keliling Persegi "+keliling);
        return keliling;
    }



    
}
