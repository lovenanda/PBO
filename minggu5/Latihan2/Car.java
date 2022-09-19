package Latihan2;

public class Car {
    private int speed = 0;

    public Car(int speed){
        this.speed = speed;
    }

    public Car(String speed){
        if(speed.equals("fast")){
            this.speed = 100;
        }else{
            this.speed = 50;
        }
    }

    public int getSpeed(){
        return speed;
    }
    
}
