//Write a program to display id and name from user.
import java.util.Scanner;
public class UsersInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Id and Name:");
        int id = input.nextInt();
        String name = input.nextLine();

        System.out.println("ID:" + id + "\t Name:" + name);
        input.close();
    }
}

