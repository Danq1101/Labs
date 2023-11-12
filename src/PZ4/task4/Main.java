//package PZ4.task4;
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        List<Student> groupOne = new LinkedList<>();
//        List<Student> groupTwo = new LinkedList<>();
//        List<Student> groupThree =  new LinkedList<>();
//        Student student = new Student("Daniil", 2, 163001, 7.0);
//        Student student1 = new Student("Egor", 2, 163001, 6.0);
//        Student student2 = new Student("Denis", 4, 163001, 3.0);
//        Student student3 = new Student("Ivan", 3, 144001, 4.9);
//        Student student4 = new Student("Nikita", 1, 144001, 2.0);
//        Student student5 = new Student("Vika", 2, 144001, 9.0);
//        Student student6 = new Student("Lena", 4, 162901, 2.0);
//        Student student7 = new Student("Masha", 3, 162901, 4.5);
//        Student student8 = new Student("Dasha", 1, 162901, 6.0);
//
//        groupOne.add(student);
//        groupOne.add(student1);
//        groupOne.add(student2);
//
//        groupTwo.add(student3);
//        groupTwo.add(student4);
//        groupTwo.add(student5);
//
//        groupThree.add(student6);
//        groupThree.add(student7);
//        groupThree.add(student8);
//
//        Map<Integer, List<Student>> groups = new HashMap<>();
//
//        groups.put(1, groupOne);
//        groups.put(2, groupTwo);
//        groups.put(3, groupThree);
//
//        Student check = new Student();
//
//        check.checkStudent(groups);
////        check.printStudent();
//
//        System.out.println(groups);
//        System.out.println(groups);
//
//
//    }
//}
