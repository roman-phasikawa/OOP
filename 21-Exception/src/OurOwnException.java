import java.util.Scanner;
class LessBalance extends Exception{
OurOwnException obj=new OurOwnException();
LessBalance(int a,int b){
    System.out.println("Your balance is "+b+" and you want to withdraw is "+a);
}

    
}
public class OurOwnException {
    int balance;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        OurOwnException obj=new OurOwnException();
        System.out.println("Enter balance");
        obj.balance=input.nextInt();
        System.out.println("Enter the Amount to Withdraw");
        int a=input.nextInt();
        obj.amountWithdraw(a);
        input.close();

    }
    private void amountWithdraw(int a) {
        try
        {
            if(a>balance)
                throw new LessBalance(a,balance);
                balance=balance-a;
                System.out.println("Your balance after withdraw is "+balance);
        }
        catch(Exception e)
        {
            System.out.println("Enter Withdraw amount less than "+balance);
        }
    }
}
