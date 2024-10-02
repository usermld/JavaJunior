package seminar_3;

import java.io.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Ivan", 35);

        try (FileOutputStream fileOutputStream = new FileOutputStream("persondata.bin");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);
            System.out.println("Объект Person сериализован.");
        }

        try (FileInputStream fileInputStream = new FileInputStream("persondata.bin");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            person = (Person) objectInputStream.readObject();
            System.out.println("Объект Student десериализован.");
        }

        System.out.println(person);
    }
}