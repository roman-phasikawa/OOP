/*Write a program that demonstrates the use of all logical operators (&&, ||, and !). This program will
evaluate several logical expressions and print the results.*/
public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;

        // Logical AND (&&)
        System.out.println("(a > b) && (a < c) = " + ((a > b) && (a < c)));

        // Logical OR (||)
        System.out.println("(a < b) || (a < c) = " + ((a < b) || (a < c)));

        // Logical NOT (!)
        System.out.println("!(a > b) = " + (!(a > b)));
    }
}


