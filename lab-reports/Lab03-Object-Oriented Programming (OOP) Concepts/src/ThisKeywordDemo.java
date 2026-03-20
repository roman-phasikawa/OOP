//Write a program to demonstrate the concept of the ‘this’ keyword.
class ThisKeywordDemo1{
    int id;
    String name;

    ThisKeywordDemo1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID:" + id + "\t Name:" + name);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        ThisKeywordDemo1 Student = new ThisKeywordDemo1(101, "Ram");
        ThisKeywordDemo1 Student1 = new ThisKeywordDemo1(102, "Shyam");
        Student.display();
        Student1.display();
    }
}


