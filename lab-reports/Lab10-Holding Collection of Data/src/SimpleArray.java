import java.util.ArrayList;

public class SimpleArray {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("elephant");

        System.out.println("Animals: " + animals);

        animals.remove("Dog");
        System.out.println("After removal: " + animals);
    }
}