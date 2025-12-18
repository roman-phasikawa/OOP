public class LogicalOperator {
    public static void main(String[] args) {
        int a=5, b=7, c=10;
        System.out.println("AND");
        System.out.println(a<b&&b<c);
        System.out.println(a<b&&b>c);

        System.out.println("OR");
        System.out.println(a<b||b>c);
        System.out.println(a>b||b>c);

        System.out.println("NOT");
        System.out.println(!(a==b));
        System.out.println(!(c>a));

    }
}
