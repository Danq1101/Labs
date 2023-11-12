package lab1;//1

import java.util.Scanner;

import static java.lang.Math.pow;

public class Number1 {
    public static void main(String[] args){
        int n = 0;
        System.out.print("Enter ur number - ");
        boolean check = true;
        while (check) {
            Scanner s = new Scanner(System.in);
            if (s.hasNextInt()) {
                n = s.nextInt();
                check = false;
            }
            else
                System.out.println("Input error, try again");
        }
        for (int i = 1; i <= 4; i++) {
            System.out.println(pow(n, i));
        }
    }
}
