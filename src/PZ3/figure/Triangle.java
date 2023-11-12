package PZ3.figure;

public class Triangle extends TwoDShape {
    private  String style;

    public Triangle(){
        style = "null";
    }

    public Triangle(double x){
        super(x, "Triangle");
        style = "sad";
    }

    public Triangle(double width, double heights, String style) {
        super(width, heights, "Triangle");
        this.style = style;
    }

    public Triangle(Triangle obj) {
        super(obj);
        style = obj.style;
    }

    public  double area(){
        return getWidth() * getHeight() / 2;
    }

    public void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
