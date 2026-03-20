import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializeDemo {
    public static void main(String[] args) {
        try {
            Student stu = new Student(101, "Ram");
            FileOutputStream fileOut = new FileOutputStream("stu.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(stu);
            out.close();
            fileOut.close();
            System.out.println("Object has been serialized successfully to stu.ser");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }
}