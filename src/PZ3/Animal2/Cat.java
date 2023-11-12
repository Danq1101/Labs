package PZ3.Animal2;

public class Cat extends Animal{

    int numberOfRats;

    public Cat(int numberOfRats, String name, int age, int weight) {
        super(weight, age, name);
        this.numberOfRats = numberOfRats;
    }

    public Cat(Cat cat) {
        super(cat);
        numberOfRats = cat.numberOfRats;
    }

    public int getNumberOfRats() {
        return numberOfRats;
    }

    public void setNumberOfRats(int numberOfRats) {
        this.numberOfRats = numberOfRats;
    }

    @Override
    void show(){
        super.show();
        System.out.println(numberOfRats);
    }
}
