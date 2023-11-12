package lab3.BSUIR.IKT.Number2.profession;

public class Driver extends Person{
    int driving_experience;

    public Driver(String name, String surname, String patronymic, int age, int driving_experience) {
        super(name, surname, patronymic, age);
        this.driving_experience = driving_experience;
    }

    @Override
    public String toString() {
        return "{" +
                "driving_experience=" + driving_experience +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                '}';
    }
}
