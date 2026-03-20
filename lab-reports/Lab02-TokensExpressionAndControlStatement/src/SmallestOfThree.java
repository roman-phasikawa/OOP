//Write a program to find the smallest number between 3 entered numbers using if else statement.

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        System.out.println("Enter any 3 integer:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a < b && a < c) {
            System.out.println(+a + " is Smallest");
        } 
        else if (b < c) {
            System.out.println(+b + " is Smallest");
        } 
        else {
            System.out.println(+c + " is Smallest");
        }
        input.close();
    }
}


