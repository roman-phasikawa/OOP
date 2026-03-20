import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        // Using List interface with ArrayList
        List<String> arraylist = new ArrayList<>();
        arraylist.add("Red");
        arraylist.add("Green");
        arraylist.add("Blue");
        System.out.println("ArrayList: " + arraylist);

        // Using List interface with LinkedList
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add("Dog");
        linkedlist.add("cat");
        linkedlist.add("Rabbit");
        System.out.println("LinkedList: " + linkedlist);
    }
}