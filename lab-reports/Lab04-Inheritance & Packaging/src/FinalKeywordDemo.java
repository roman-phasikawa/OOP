//Write a program to demonstrate the concept of the final variable, final method and final class.

final class FinalClass {   // final class

    final int x = 10;      // final variable

    final void show() {    // final method
        System.out.println("Final variable value: " + x);
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {

        FinalClass obj = new FinalClass();
        obj.show();
    }
}


