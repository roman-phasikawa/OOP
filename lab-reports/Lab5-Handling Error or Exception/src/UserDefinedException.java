//Write a program to demonstrate the concept of user-defined exceptions.
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);// Passes your message to the parent Exception class
    }
}

public class UserDefinedException {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } 
        else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(14);
        } 
        catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


