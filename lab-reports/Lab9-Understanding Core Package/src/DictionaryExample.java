import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryExample {
    public static void main(String[] args) {
        Dictionary<Integer, String> dictionary = new Hashtable<>();

        dictionary.put(1, "Apple");
        dictionary.put(2, "Banana");
        dictionary.put(3, "Cherry");

        System.out.println("key 1: " + dictionary.get(1));
        System.out.println("key 2: " + dictionary.get(2));
        System.out.println("key 3: " + dictionary.get(3));
    }
}