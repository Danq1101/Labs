package PZ3.figure;

public abstract class TwoDShape {
    private double width;
    private double height;

    private String name;

    public TwoDShape(){
        width = height = 0;
        name = "null";
    }

    public TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public TwoDShape(double x, String name){
        height = width = x;
        this.name = name;
    }

    public TwoDShape(TwoDShape obj){
        width = obj.width;
        height = obj.height;
        name = obj.name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }

     abstract public double area();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
