public class MultipleTryCatch {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            // System.out.println("Division by zero");
        }
        // finally{
        //     System.out.println("This is finally block");
        // }
        try{
            int arr[]={10,20,30,40};
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException o)
        {
            System.out.println("Array put of index");
            System.out.println(o.getMessage());
        }
    }

}
