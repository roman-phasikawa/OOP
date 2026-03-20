import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("Delhi");
        cities.add("Kathmandu");
        cities.add("Bhaktapur");
        cities.add("Melamchi");
        cities.add("Pokhara");

        System.out.println("Cities: " + cities);

        cities.addFirst("Lalitpur");
        cities.addLast("Butwal");
        cities.remove("Delhi");

        System.out.println("updated cities: " + cities);
    }
}