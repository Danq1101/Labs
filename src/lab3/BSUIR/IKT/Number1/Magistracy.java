package lab3.BSUIR.IKT.Number1;

class Magistracy extends Student {

    String siWork;

    Magistracy(String firstName, String lastName, String group, String siWork, double averageMark) {
        super(firstName, lastName, group, averageMark);
        this.siWork = siWork;
    }

    Magistracy(Student student, String siWork){
        super();
        this.siWork = siWork;
    }

    @Override
    void getScholarship() {
        System.out.println(firstName + " " + lastName + " " + group + " " + siWork);
        if (averageMark == 8)
            System.out.println("200 BYN");
        else
            System.out.println("180 BYN");
    }
}
