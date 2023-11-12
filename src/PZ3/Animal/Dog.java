package PZ3.Animal;

public class Dog extends Animal{
    public Dog(int age, double weight, String name) {
        super(age, weight, name);
    }

    public Dog(Animal animal) {
        super(animal);
    }

    @Override
    public void voice(){
        System.out.println("Dog voice");
    }
}
