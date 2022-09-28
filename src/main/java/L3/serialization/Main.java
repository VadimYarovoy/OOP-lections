package L3.serialization;

import java.io.*;

public class Main {
    public  static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student(1, "Ivan");
        FileOutputStream fileOutputStream = new FileOutputStream("students.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("Done");

        Student newStudent = deserialization();
        System.out.println(newStudent.name);

    }

    private static Student deserialization() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("students.txt"));
        Student student = (Student) objectInputStream.readObject();
        objectInputStream.close();
        return student;

    }
}
