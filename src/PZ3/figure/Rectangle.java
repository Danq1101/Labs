package PZ3.figure;

public class Rectangle extends TwoDShape {
    public Rectangle(){
        super();
    }

    public Rectangle(double width, double height) {
        super(width, height, "rectangle");
    }

    public Rectangle(double x, String name) {
        super(x, "rectangle");
    }

    public Rectangle(TwoDShape obj) {
        super(obj);
    }

    public boolean isSquare(){
        if(getWidth() == getHeight()){
            return true;
        }
        return false;
    }

    public double area(){
        return getWidth() * getHeight();
    }
}
