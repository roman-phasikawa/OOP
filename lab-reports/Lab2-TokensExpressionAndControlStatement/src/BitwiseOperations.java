//Write a program to perform different bitwise operations on two integers.
public class BitwiseOperations {

    public static void main(String[] args) {

        int a = 10;  // 1010
        int b = 6;   // 0110

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Bitwise AND
        System.out.println("a & b = " + (a & b));

        // Bitwise OR
        System.out.println("a | b = " + (a | b));

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));

        // Bitwise NOT
        System.out.println("~a = " + (~a));
        System.out.println("~b = " + (~b));

        // Left Shift
        System.out.println("a << 1 = " + (a << 1));

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1));
    }
}


