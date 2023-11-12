package lab1;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        int x = (int)(Math.random()* 9) + 1;
//        Random t = new Random(5);
//        int x = t.nextInt();
        int y = 0;
        Scanner s = new Scanner(System.in);
        while(x != y){
            System.out.print("Enter ur number - ");
            y = s.nextInt();
            if (x > y)
                System.out.println("Bigger");
            if (x < y)
                System.out.println("Lower");
        }
        System.out.println("U win");
    }
}
