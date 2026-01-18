import java.util.Scanner;

public class ExceptionThrowThrowsBlock 
{
    public void readAge(int age)throws Exception
    {
        if(age<15||age>60)
            throw new Exception();
        else
            System.out.println("Your Age is:"+age);
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int age = in.nextInt();
        ExceptionThrowThrowsBlock obj=new ExceptionThrowThrowsBlock();
        try
        {
            obj.readAge(age);
        }
        catch(Exception e)
        {
            System.out.println("Age must be Between 15 and 60 ..Age Entered is:"+age);
        }
        in.close();
        
    }
}
