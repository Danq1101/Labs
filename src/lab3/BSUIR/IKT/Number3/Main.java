package lab3.BSUIR.IKT.Number3;
// Фасад патерн
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Pear pear = new Pear();
        Plum plum = new Plum();
        apple.cost = 700;
        apple.m = 0.6;
        pear.cost = 1000;
        pear.m = 1;
        plum.cost = 900;
        plum.m = 2;
        System.out.println(apple.printInfo() + " apple cost = " + apple.frCost());
        System.out.println(pear.printInfo() + " pear cost = " + pear.frCost());
        System.out.println(plum.printInfo() + " plum cost = " + plum.frCost());
        double res = apple.frCost() + pear.frCost() + plum.frCost();
        System.out.println("Amount cost of fruit = " + res);

    }
}

