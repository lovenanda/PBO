public class Titik {
    protected double x;
    protected double y;

    public Titik(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void tampil(){
        System.out.println("DATA TITIK");
        System.out.println("titik X \t:"+ this.x);
        System.out.println("titik Y \t:"+ this.y);
    }

    public double hitungJarak(Titik t2){
        double jarak; 
        jarak = Math.pow(Math.pow(x -t2.x,2)+Math.pow(y-t2.y,2),0.5);
        return jarak;
        
    }

}

