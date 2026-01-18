import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int sum[][]=new int[3][3];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Your first matrix's are:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter second matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=input.nextInt();
            }
        }
        
        System.out.println("Your second matrix's are:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

         System.out.println("Sum of Two Matrix are:-");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        input.close();

    }
}
