//Write a program to demonstrate the concept of parameterized constructors.
class Student1 {
    int id;
    String firstname;
    String lastName;

    Student1(int i, String n, String a) {
        id = i;
        firstname = n;
        lastName = a;
    }

    void display() {
        System.out.println("ID:" + id + "\t Name:" + firstname +" "+ lastName);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student1 student = new Student1(101, "Ram", "Thapa");
        Student1 student2 = new Student1(102, "Shyam", "Karki");
        student.display();
        student2.display();
    }
}


