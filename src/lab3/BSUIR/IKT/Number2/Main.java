package lab3.BSUIR.IKT.Number2;
// Строительынй паттерн
import lab3.BSUIR.IKT.Number2.deteils.Engine;
import lab3.BSUIR.IKT.Number2.profession.Driver;
import lab3.BSUIR.IKT.Number2.vehicles.Lorry;
import lab3.BSUIR.IKT.Number2.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Daniil", "Soboleuskii", "Aleks", 19, 1);
        Engine engine = new Engine(180, "bmv");
        Lorry lorry = new Lorry("Big", engine, driver, "bmv", 2);
        SportCar sportCar = new SportCar("Big", engine, driver, "bmv", 240);
    }
}
