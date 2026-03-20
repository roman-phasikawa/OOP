import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Hari");
        names.add("Ram"); // duplicate element, will not be added

        System.out.println("Names: " + names);
        System.out.println("Contains Shyam? " + names.contains("Shyam"));

        names.remove("Hari");
        System.out.println("After removal: " + names);
        System.out.println("Total names: " + names.size());
    }
}