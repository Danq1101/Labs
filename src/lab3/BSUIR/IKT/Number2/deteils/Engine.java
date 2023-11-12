package lab3.BSUIR.IKT.Number2.deteils;
//патерн компановщик
public class Engine {
    int power;
    String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    @Override
    public String toString() {
        return "{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
