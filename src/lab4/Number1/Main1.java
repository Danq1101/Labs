package lab4.Number1;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        List<Student> list1 = new LinkedList<>();
        Student st1 = new Student("Daniil", 1);
        Student st2 = new Student("Egor", 3);
        Student st3 = new Student("Ivan", 3);
        Student st4 = new Student("Sen9", 3);

        Student st5 = new Student("Milana", 3);
        Student st6 = new Student("Nast9", 2);
        Student st7 = new Student("Katusha", 4);

        Student work = new Student();

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list1.add(st5);
        list1.add(st6);
        list1.add(st7);
        list1.add(st4);

        work.printStudents(list, 3);
        work.insert(list, list1);
        work.union(list, list1);

        Set<Student> set = new TreeSet<>();

        set.add(st1);
        set.add(st5);
        set.add(st6);
        set.add(st7);

        System.out.println(set);
    }
}

