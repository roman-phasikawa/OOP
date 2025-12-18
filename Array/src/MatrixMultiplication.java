import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) 
    {
        int first[][]=new int[3][3];
        int second[][]=new int[3][3];
        int result[][]=new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of first 3x3 matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                first[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter elements of second 3x3 matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                second[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                result[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    result[i][j]+=first[i][k]*second[k][j];
                }
            }
        }
        System.out.println("Resultant matrix after multiplication:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
    
}
