import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");

        System.out.println("Hashtable contents: " + table);
        System.out.println("Value for key 2: " + table.get(2));
    }
}