public class ConditionalOperator {
    public static void main(String[] args) {
        //Ternary Operator
        int a=40, b=50, c=200, large;
        large=(a<b)?(b<c?c:b):(a<c?c:a);
        System.out.println("Largest Number is: "+large);
    }
}
