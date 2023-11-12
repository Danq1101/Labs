package PZ4.onemoreshit;

public class Car implements Cloneable {
    private String name;
    private Driver driver;

    Car (String name, Driver driver){
        this.name = name;
        this.driver = driver;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", driver=" + driver +
                '}';
    }
}
