package overloading;

public class Codeternity {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run();
        vehicle.run(100);
        vehicle.run("fast");
    }
    
}
