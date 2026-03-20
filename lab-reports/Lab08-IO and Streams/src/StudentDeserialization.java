import java.io.*;
public class StudentDeserialization {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("stu.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student s= (Student)in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Student object has been deserialized:\n");
            System.out.println("Student ID: " + s.id);
            System.out.println("Student Name: " + s.name);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}