package PZ4.SerAndDeser;

import java.io.*;

public class SerializeCat {
    static String FILE_NAME = "testSer.ser";

    public static void main(String[] args) {
        serialize();
        Cat cat = deserialize();
    }

    public static Cat deserialize(){
        Cat cat = null;
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)){
            cat = (Cat) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return cat;
    }

    public static void serialize(){
        Cat cat = new Cat("Барсик");
        try(FileOutputStream fs = new FileOutputStream(FILE_NAME);
        ObjectOutputStream os = new ObjectOutputStream(fs)){
            os.writeObject(cat);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
