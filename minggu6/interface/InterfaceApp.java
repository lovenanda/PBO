public class InterfaceApp {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.accelerate();
        car1.turnLeft();
        car1.turnRight();
    }

    interface Drivable{
        void accelerate();
        void turnLeft();
        void turnRight();

    }

    class Car implements Drivable{
        @Override
        public void accelerate(){
            System.out.println("accelerate");
        }

        @Override
        public void turnLeft(){
            System.out.println("Car is Turn Left");
        }

        @Override
        public void turnRight(){
            System.out.println("Car is Turn Right");
        }

    }
}