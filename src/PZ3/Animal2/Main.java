package PZ3.Animal2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2, "Pog", 18, 6);
        Cat cat = new Cat(cat1);
        System.out.println(cat.getNumberOfRats() + " " +  cat.getName() + " " +  cat.getWeight() + " " +  cat.getAge());
    }
}
