/*Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor
that increments count every time an object is created. Print the value of count after creating several objects.*/
public class StaticCounter {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();

        System.out.println("Number of objects created: " + Counter.count);
    }
}
class Counter {

    static int count = 0;   // static variable

    Counter() {
        count++;    // increment when object is created
    }
}


