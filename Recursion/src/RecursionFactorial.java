import java.util.Scanner;

public class RecursionFactorial {
    public static void main(String[] args) {
        int n, f;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter any number: ");
        n=inp.nextInt();
        f=fact(n);
        System.err.println("The factorial is: "+f);
        inp.close();
    }
    static int fact(int n){
        if(n<=1)
            return 1;
        else
            return n*fact(n-1);
        
    }
   
}
