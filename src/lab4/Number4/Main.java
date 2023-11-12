package lab4.Number4;

import java.io.*;

public class Main{
    public static void main(String[] args) {
        File file = new File("newhorse.txt");
        Horse horse = new Horse(2, 120, "morely");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            oos.writeObject(horse);

            Horse horse1 = (Horse) ois.readObject();
            System.out.println(horse1);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}



