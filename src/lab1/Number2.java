package lab1;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        int password = 0;
        Scanner s = new Scanner(System.in);
        while (password != 1234){
            System.out.println("Enter ur password(1234) ");
            password = s.nextInt();
        }
        System.out.println("Congratulations");
    }
}
