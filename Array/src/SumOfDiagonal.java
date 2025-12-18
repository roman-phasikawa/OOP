import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args){
        int matrix[][]= new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of 3x3 matrix:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        int DiagonalSum = 0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(i == j) {
                    DiagonalSum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements: " + DiagonalSum);
        scanner.close();
    }    
}
