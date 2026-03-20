import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Ram");
        names.add("Hari");
        names.add("Shyam");

        System.out.println("vector elements: " + names);
        System.out.println("First element: " + names.get(0));
    }
}