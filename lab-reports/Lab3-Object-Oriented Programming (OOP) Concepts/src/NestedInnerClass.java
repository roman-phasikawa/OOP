//Write a program to demonstrate the concept of nested inner class.
class Outer {

    int x = 10;

    class Inner {   // nested inner class
        void display() {
            System.out.println("Value of x: " + x);
        }
    }
}

public class NestedInnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();          // outer class object
        Outer.Inner in = obj.new Inner(); // inner class object
        in.display();
    }
}


