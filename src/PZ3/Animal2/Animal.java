package PZ3.Animal2;

public class Animal  {
    private double weight;
    private int age;
     private String name;

    public Animal(double weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public Animal(Animal animal){
        age = animal.age;
        weight = animal.weight;
        name = animal.name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void show(){
        System.out.println(age + weight + name);
    }
}
