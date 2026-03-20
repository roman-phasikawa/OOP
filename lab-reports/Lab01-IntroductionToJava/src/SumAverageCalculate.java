//Write a program that takes three numbers as input to calculate sum and average.
import java.util.Scanner;

public class SumAverageCalculate {
    public static void main(String[] args) {

        int[] arr = new int[3];
        Scanner input = new Scanner(System.in);

        int sum = 0; 
        System.out.println("Enter any 3 integer:");
        for (int i = 0; i < 3; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        float average = sum / 3; 
        System.out.println("Sum: " + sum + "\t Average: " + average);
        input.close();
    }

}
