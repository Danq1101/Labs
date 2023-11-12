package lab4.Number4;

import java.io.Serializable;

class Horse extends Animal implements Serializable {
    int age;
    double weight;
    String name;

    public Horse(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
