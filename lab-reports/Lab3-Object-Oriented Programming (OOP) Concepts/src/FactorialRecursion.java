//Write a Program to Recursive program to find the factorial of an integer.

import java.util.Scanner;

public class FactorialRecursion {
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = input.nextInt();
        System.out.println("Factorial = " + factorial(n));
        input.close();
    }
}


