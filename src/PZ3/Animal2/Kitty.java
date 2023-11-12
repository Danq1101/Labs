package PZ3.Animal2;

public class Kitty extends Cat {
    double timeToEat;
    public Kitty(int numberOfRats, String name, int age, int weight, int timeToEat) {
        super(numberOfRats, name, age, weight);
        this.timeToEat = timeToEat;
    }

    public Kitty(Kitty kitty) {
        super(kitty);
        timeToEat = kitty.timeToEat;
    }

    @Override
    void show() {
        super.show();
        System.out.println(timeToEat);
    }
}
