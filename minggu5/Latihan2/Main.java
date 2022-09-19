package Latihan2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(80);
        Car car2 = new Car("fast");
        System.out.println("The car1 speed is "+car1.getSpeed());
        System.out.println("The car2 speed is "+car2.getSpeed());
    }
    
}
