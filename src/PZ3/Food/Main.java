package PZ3.Food;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Food food = new Food();
        food.prepare("apple", new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Cooking " + str);
            }
        });
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter ur food - ");
//        String str = s.nextLine();
//        food.prepare(str, el -> System.out.println("Cooking " + str));
    }
}
