package lab1;

public class Number9 {
    public static void main(String[] args){
        int x = (int)(Math.random() * 151 + 5);
        System.out.println(x);
        if (x>25 && x < 100)
            System.out.println("U got it");
        else
            System.out.println("It was close");
    }
}
