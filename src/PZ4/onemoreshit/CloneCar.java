package PZ4.onemoreshit;

import java.util.ArrayList;

public class CloneCar {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Гиви", new Driver("Енукидзе Гиви",  19));
        Car clonedCar = (Car) car.clone();
        System.out.println("Orig" + car);
        System.out.println("Dublic" + clonedCar);
        Driver cloneCarDriver = clonedCar.getDriver();
        cloneCarDriver.setName("Yri Jukovec");
        System.out.println("Orig after change" + car);
        System.out.println("Clone after change" + clonedCar);

    }
}
