package lab1;

import java.util.Scanner;

public class Number12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        while(n < 3) {
            System.out.println("Enter n > 3");
            n = s.nextInt();
        }
        int[] ar = new int[n];
        System.out.println("First array");
        for (int i = 0; i < n; i++)
            ar[i] = (int) (Math.random()*n);
        for (int i = 0; i < n; i++)
            System.out.println(ar[i]);
        System.out.println("Second array");
        for (int i = 0; i < n; i++) {
            if((ar[i] % 2) == 0)
                System.out.println(ar[i]);
        }
    }
}
