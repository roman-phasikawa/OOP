//Write a program to find the grade of a student using switch Case.

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your obtained marks:");
        int marks = input.nextInt();
        if(marks<0||marks<100){
            System.out.println("Please enter marks between 0 to 100");
        }
        else{
            switch (marks / 10) {
                case 10:
                    System.out.println("Grade A+");
                    break;
                case 9:
                    System.out.println("Grade A");
                    break;
                case 8:
                    System.out.println("Grade B+");
                    break;
                case 7:
                    System.out.println("Grade B");
                    break;
                case 6:
                    System.out.println("Grade C+");
                    break;
                case 5:
                    System.out.println("Grade C");
                    break;
                case 4:
                    System.out.println("Grade D+");
                    break;
                default:
                    System.out.println("NG");
            }
        }
        input.close();
    }
}


