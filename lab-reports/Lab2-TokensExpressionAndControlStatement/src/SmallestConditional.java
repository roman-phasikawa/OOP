//Write a program to find the smallest of three numbers using the conditional operator(Ternary).
public class SmallestConditional {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 30;
        int small;
        small = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println("Smallest Number:" + small );
    }
}
