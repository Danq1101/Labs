package lab3.BSUIR.IKT.Number1;

class Student {
    String firstName, lastName, group;
    double averageMark;

    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {

    }

    void getScholarship() {
        System.out.println(firstName + " " + lastName + " " + group);
        if (averageMark == 8)
            System.out.println("100 BYN");
        else
            System.out.println("80 BYN");
    }
}
