package PZ3.Animal;

class Kitty extends Cat{
    double feedingTime;

    public Kitty(Kitty kitty){
        super(kitty);
        feedingTime = kitty.feedingTime;
    }

    public Kitty(int age, double weight, String name, int numberOfRats) {
        super(age, weight, name, numberOfRats);
    }
}
