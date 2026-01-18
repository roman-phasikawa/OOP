import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int marks;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Marks");
        marks = input.nextInt();
        if(marks<0||marks>100){
            System.out.println("Enter a valid number between 0 and 100");
        }        
        else{
            switch(marks/10){
                case 9:
                    System.err.println("Grade A+");
                    break;
                case 8:
                    System.err.println("Grade A");
                    break;
                case 7:
                    System.err.println("Grade B+");
                    break;
                case 6:
                    System.err.println("Grade B");
                    break;
                case 5:
                    System.err.println("Grade C+");
                    break;
                case 4:
                    System.err.println("Grade C");
                    break;
                default:
                    System.err.println("Non-Graded NG");

            }
        }
        input.close();
    }
}
