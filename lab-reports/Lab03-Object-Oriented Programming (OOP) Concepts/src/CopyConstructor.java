//Write a program to demonstrate the concept of Copy constructor.
class Student {

    String name;
    int age;

    Student() {
        name = "Ram";
        age = 20;
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println();
    }

    Student(Student s) {
        name = s.name;
        age = s.age;
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student(obj);
    }
}


