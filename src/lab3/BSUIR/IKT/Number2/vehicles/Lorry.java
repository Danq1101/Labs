package lab3.BSUIR.IKT.Number2.vehicles;

import lab3.BSUIR.IKT.Number2.deteils.Engine;
import lab3.BSUIR.IKT.Number2.profession.Driver;

public class Lorry extends Car{

    int maxWeight;

    public Lorry(String carClass, Engine engine, Driver driver, String mark, int maxWeight) {
        super(carClass, engine, driver, mark);
        this.maxWeight = maxWeight;
    }

}
