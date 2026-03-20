// Write a program to swap two numbers without using a third variable.
public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("a:" + a + "\t b:" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a + "\t b:" + b);
    }
}