
public class Main {
    public static void main(String[] args) {
        Car.setCountCars(2);
        Car[] car = new Car[Car.getCountCars()];
        for(int i = 0; i < Car.getCountCars(); i++) {
            car[i] = new Car();
        }

        for(int i = 0; i < Car.getCountCars(); i++) {
            car[i].print();
            System.out.println("");
        }

        Car car1 = new Car();
        MaxSpeed speed = new MaxSpeed();
        car1.setMaxSpeed(300);
        car1.getSpeed(speed);
        System.out.println("Скорость " + speed.maxSpeed);
    }
}