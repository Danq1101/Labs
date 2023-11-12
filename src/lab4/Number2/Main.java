package lab4.Number2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        int n, min, j = 0, k;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter amount of numbers - ");
        n = s.nextInt();
        int[] ar = new int[10];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ur number - ");
            al.add(s.nextInt());
        }
        System.out.println(al);
        System.out.print("Enter amount of numbers to remove - ");
        k = s.nextInt();
        for (int i = 0; i < k; i++) {
            System.out.print("Enter index of number to remove - ");
            al.remove(s.nextInt());
            System.out.println(al);
        }
        System.out.print("Enter number to find - ");
        int q = s.nextInt();
        if (al.contains(q))
            System.out.println(q);
        else {
            min = 10;
            for (int i = 0; i < n - k; i++) {
                ar[i] = Math.abs(al.get(i) - q);
                if (min > ar[i]){
                    min = ar[i];
                    j = i;
                }
            }
            System.out.println("Ur number approximately equal to = " + al.get(j));
        }
    }
}

