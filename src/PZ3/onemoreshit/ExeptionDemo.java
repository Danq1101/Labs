package PZ3.onemoreshit;

public class ExeptionDemo {
    public static int method1(int a, int b){

        int c = 0;
        try{
            c = a/b;
        }catch (ArithmeticException e){
            System.out.println("Error " + e);
            throw e;
        } return c;
    }

    public static void method2(int c){
        System.out.println("c = " + c);
    }

    public static void main(String[] args) {
        int c = 0;
        try{
            c = method1(5, 0); method2(c);
        }catch (ArithmeticException e){
            System.out.println("Error while compiling " + e);
        }
    }
}
