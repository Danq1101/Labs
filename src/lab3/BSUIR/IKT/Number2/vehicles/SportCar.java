package lab3.BSUIR.IKT.Number2.vehicles;

import lab3.BSUIR.IKT.Number2.deteils.Engine;
import lab3.BSUIR.IKT.Number2.profession.Driver;

public class SportCar extends Car{

    int maxSpeed;

    public SportCar(String carClass, Engine engine, Driver driver, String mark, int maxSpeed) {
        super(carClass, engine, driver, mark);
        this.maxSpeed = maxSpeed;
    }


}
