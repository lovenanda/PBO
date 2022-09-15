public class VolumePrisma extends BangunRuang {

    private float a; // alas segitiga
    private float t; // tinggi segitiga
    private float p; // panjang prisma (tinggi prisma)

    //construktor 
    VolumePrisma(float a,float t, float p){
        this.a = a;
        this.t = t;
        this.p = p;
    }

    @Override
    void volume(){
        float luasAlas = (this.a * this.t / 2); //(a*t/2)
        float volume = luasAlas * p; //(LA*p)
        System.out.println("\nPolume Prisma Segitiga");
        System.out.println("Alas Segitiga : "+this.a);
        System.out.println("Tinggi Segitiga : "+this.t);
        System.out.println("Luas Segitiga : "+luasAlas);
        System.out.println("Tinggi Prisma : "+this.p);
        System.out.println("Volume Prisma Segitiga : "+volume);
        
    }

    
}
