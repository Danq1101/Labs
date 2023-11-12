package lab1;

public class Number3 {
    public static void main(String[] args){
        int n, sum = 0;
        for (n = 1; n < 10000; n++) {
            sum += n;
        }
        System.out.println("Ur res is = " + sum);
    }
}
