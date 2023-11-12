package lab3.BSUIR.IKT.Number2.vehicles;

import lab3.BSUIR.IKT.Number2.deteils.Engine;
import lab3.BSUIR.IKT.Number2.profession.Driver;

public class Car {
    String carClass;
    Engine engine;
    Driver driver;
    String mark;

    public Car(String carClass, Engine engine, Driver driver, String mark) {
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        this.mark = mark;
    }

    void start(){
        System.out.println("start");
    }

    void stop(){
        System.out.println("stop");
    }

    void turnRight(){
        System.out.println("turn right");
    }

    void turnLeft(){
        System.out.println("turn left");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", mark='" + mark + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Engine engine = new Engine(360, "BMV");
        Driver driver = new Driver("Daniil", "Sabaleuskii", "Aleksandrovich", 18, 1);
        Car car = new Car("sporty", engine, driver, "Mersedes");
        System.out.println(car.toString());

    }
}
