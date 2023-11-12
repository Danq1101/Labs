package lab3.BSUIR.IKT.Number1;//1

import java.util.Scanner;
// паттерн строитель
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] a = new Student[10];
        System.out.println("Enter mark of the Students");
        double mark = s.nextDouble();
        double mark1 = s.nextDouble();
        double mark2 = s.nextDouble();
        double mark3 = s.nextDouble();
        Student st = new Student("Daniil", "Sabaleuskii", "163001" , mark);
        Student st1 = new Student("Egor", "Borodko", "163001" , mark1);
        Student st2 = new Student("Denis", "Solovei", "155001" , mark2);
        Magistracy st3 = new Magistracy(st1, "someWork");
        a[0] = st;
        a[1] = st1;
        a[2] = st2;
        a[3] = st3;
        for (int i = 0; i < 4; i++) {
            a[i].getScholarship();
        }
    }
}

