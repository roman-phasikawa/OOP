public class TryCatchBlock {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        try{
            c=a/b;
            System.out.println(c);
            System.out.println("This will not be printed");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            // System.out.println("Division by zero");
        }
        finally{
            System.out.println("This is finally block");
        }
    }

}
