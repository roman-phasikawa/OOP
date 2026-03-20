/*Write a program to take two numbers as input and then show the results of addition, subtraction,
multiplication, division, and modulus operations using these numbers.*/

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("Enter any two integer:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int result;

        System.out.println("a=" + a + "\t b=" + b);
        result = a + b;
        System.out.println("Addiction:" + result);
        result = a - b;
        System.out.println("Subtraction:" + result);
        result = a * b;
        System.out.println("Multiplication:" + result);
        result = a / b;
        System.out.println("Division:" + result);
        result = a % b;
        System.out.println("Modular Division:" + result);
        input.close();
    }
}


