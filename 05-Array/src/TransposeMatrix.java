public class TransposeMatrix {
    public static void main(String[] args) 
    {
        int matrix[][]= new int[3][3];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter elements of 3x3 matrix:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Transpose of the matrix:");
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        scanner.close();
     }
}

