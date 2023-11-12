package PZ3.Animal;

public abstract class Animal { // 1 - 9 стр 34
    private int age;
    private double weight;
    private String name;

    public abstract void voice();

    public Animal(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public Animal(Animal animal){
        age = animal.age;
        weight = animal.weight;
        name = animal.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    void show(){
        System.out.println("age = " + age + " weight = " + weight + " name - " + name);
    }

}

