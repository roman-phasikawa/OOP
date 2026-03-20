//Write a program to demonstrate the concept of class and object.
class Student0 {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class ClassObjectDemo{
    public static void main(String[] args) {

        // Creating object of Student class
        Student0 s1 = new Student0();

        // Assigning values
        s1.id = 101;
        s1.name = "Roman";

        // Calling method using object
        s1.display();
    }
}
  
