//Write a program that compares two integers using each of the relational operators and displays the results.
public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        boolean c;
        //less than
        c = a < b;
        System.out.println("a < b :" + c);
        //greater than
        c = a > b;
        System.out.println("a > b :" + c);
        //less than equals to
        c = a <= b;
        System.out.println("a <= b :" + c);
        //greater than equals to
        c = a >= b;
        System.out.println("a >= b :" + c);
        //equals to
        c = a == b;
        System.out.println("a == b :" + c);
        //Not equals to
        c = a != b;
        System.out.println("a != b :" + c);
    }
}


