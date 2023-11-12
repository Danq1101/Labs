package lab2;

public class Main2 {
    public static void main(String[] args) {
        Sklad sk = new Sklad();
        sk.setNumber(100);
        sk.setCost(100);
        sk.value();
        sk.ch(189000);
        sk.numberofproduct(2, 4, 6, 8);

    }
}

class Sklad{
    int number;
    double cost;
    Sklad(){}
    Sklad(int number, double cost){
        this.number = number; this.cost = cost;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    double value(){
        System.out.println(number * cost);
        return number * cost;
    }
    void ch(double n){
        System.out.println(n);
        if (value() > n) System.out.println("Too much");
        else System.out.println("Time to byu it");
    }

    void numberofproduct(int... v){
        int number = 0;
        for (int i = 0; i < v.length; i++) {
            number += v[i];
        }
        System.err.println("All product: " + number);
    }

}
