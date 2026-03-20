import java.util.*;

class StudentC {
    String name;
    int age;

    StudentC(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class AgeComparator implements Comparator<StudentC> {
    @Override
    public int compare(StudentC s1, StudentC s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<StudentC> stu = new ArrayList<>();
        
        stu.add(new StudentC("Ram", 22));
        stu.add(new StudentC("Hari", 19));
        stu.add(new StudentC("Shyam", 21));

        System.out.println("Before Sorting:");
        for (StudentC s : stu) {
            System.out.println(s);
        }

        Collections.sort(stu, new AgeComparator());

        System.out.println("\nAfter Sorting by Age:");
        for (StudentC s : stu) {
            System.out.println(s);
        }
    }
}