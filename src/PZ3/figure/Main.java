package PZ3.figure;

public class Main {
    public static void main(String[] args) {
        TwoDShape[] shape = new TwoDShape[5];
        shape[0] = new Triangle(12, 8 , "right");
        shape[1] = new Rectangle(1, "left");
        shape[2] = new Rectangle(10, 5);
        shape[3] = new Triangle(5, 3 , "right");
        for (int i = 0; i < shape.length; i++) {
            System.out.println("object is " + shape[i].getName());
            System.out.println("Area is " + shape[i].area());
            System.out.println();

        }
    }
}
