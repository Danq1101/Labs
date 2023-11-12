package lab2;

public class Main5 {
    public static void main(String[] args) {
        String str = "345.456";
        double b = 380.9001;
        double d;
        Double x = Double.valueOf(b);
        String pi = Double.toString(3.14);
        System.out.println("double = " + x);
        System.out.println("from String to double = " + Double.parseDouble(str));
        System.out.println("from double to String = " + pi);
        System.out.println("int = " + x.intValue());
        System.out.println("float = " + x.floatValue());
        System.out.println("byte = " + x.byteValue());
        System.out.println("long = " + x.longValue());
        System.out.println("short = " + x.shortValue());
    }
}
