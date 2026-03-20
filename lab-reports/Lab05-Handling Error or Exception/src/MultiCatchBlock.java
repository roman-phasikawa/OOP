//Write a program to demonstrate the concept of try and multiply catch block.
public class MultiCatchBlock {
    public static void main(String[] args) {

        try {
            int a = 10, b = 0;
            int c = a / b;              // ArithmeticException
            System.out.println(c);

            int[] arr = new int[3];
            arr[4] = 20;                // ArrayIndexOutOfBoundsException
            System.out.println(arr[4]);

            String name = "Java"; 
            char ch = name.charAt(4);
            System.out.println(ch);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught");

        } 
        catch (Exception e) {
            System.out.println("General Exception caught: "+e.getMessage());
        }
    }
}
    