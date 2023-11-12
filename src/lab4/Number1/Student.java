package lab4.Number1;

import java.util.List;
import java.util.Objects;

class Student implements Comparable<Student> {
    String name;
    int course;

    Student() {
    }

    Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public Student(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    void printStudents(List<Student> list, Integer course) {
        list = list.stream().filter(student -> student.getCourse() == course).toList();
        System.out.println(list);
    }

    void union(List<Student> set1, List<Student> set2) {
        set1.addAll(set2);
        System.out.println(set1);
    }

    void insert(List<Student> set1, List<Student> set2) {
        set2.retainAll(set1);
        System.out.println(set2);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name ='" + name + '\'' +
                ", course =" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public int compareTo(Student o) {
        return course - o.course;
    }
}
