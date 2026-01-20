public class TryMultipleCatch{
    public static void main(String[] args) {
        try {
            int[] numbers = {2, 4, 6};
            int divisor = 0;
            
            // Potential ArithmeticException (Division by zero)
            int result = numbers[0] / divisor; 
            
            // Potential ArrayIndexOutOfBoundsException
            System.out.println("Value at index 5: " + numbers[5]);

        } 
        catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You tried to access an index that doesn't exist.");
        } 
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
        finally {
            System.out.println("Execution completed (cleanup).");
        }
    }
}