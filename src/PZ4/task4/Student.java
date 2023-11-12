//package PZ4.task4;
//
//import java.util.List;
//import java.util.Map;
//
//public class Student {
//    private String name;
//    private int course;
//    private int group;
//    private double marks;
//
//    public Student(){
//    }
//
//    public Student(String name, int course, int group, double marks) {
//        this.name = name;
//        this.course = course;
//        this.group = group;
//        this.marks = marks;
//    }
//
//    public double getMarks() {
//        return marks;
//    }
//
//    public void setCourse(int course) {
//        this.course = course;
//    }
//
//    public int getCourse() {
//        return course;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void printStudent(Map<Integer, List<Student>> list, int course){
////        for (Student std: list) {
//            if (std.getCourse() == course)
//                System.out.println(std.getName());
//        }
//    }
//
//    public void checkStudent(Map<Integer, List<Student>> list){
//        int q = 0;
//        for (List<Student> list1: std){
//            if (std.getMarks() < 3.0) {
//                System.out.println("Mark of student < 3");
//                list.remove(q);
//            }
//            else{
//                System.out.println("Everything is fine");
//                std.setCourse(std.getCourse() + 1);
//            }
//            q++;
//        }
//        System.out.println(list);
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", course=" + course +
//                ", group=" + group +
//                ", marks=" + marks +
//                '}';
//    }
//}
