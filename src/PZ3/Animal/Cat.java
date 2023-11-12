package PZ3.Animal;

class Cat extends Animal{
    int numberOfRats;
    public Cat(int age, double weight, String name, int numberOfRats) {
        super(age, weight, name);
        this.numberOfRats = numberOfRats;
    }

    public Cat(Cat cat){
        super(cat);
        numberOfRats = cat.numberOfRats;
    }

    public Cat(Animal animal, int numberOfRats) {
        super(animal);
        this.numberOfRats = numberOfRats;
    }

    @Override
    public void voice() {
        System.out.println("Cat voice");
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    public int getNumberOfRats() {
        return numberOfRats;
    }

    public void setNumberOfRats(int numberOfRats) {
        this.numberOfRats = numberOfRats;
    }

    @Override
    void show() {
        super.show();
        System.out.print("number of rats = " + numberOfRats);
    }
}
