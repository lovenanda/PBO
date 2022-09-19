package overloading;

public class Vehicle {
    public void run(){
        System.out.println("Vehicle is running");
    }

    public void run(int speed){
        System.out.println("Vehicle is running at "+speed+" km/h");
    }

    public void run(String speed){
        System.out.println("Vehicle is running "+speed);
    }
    
}
