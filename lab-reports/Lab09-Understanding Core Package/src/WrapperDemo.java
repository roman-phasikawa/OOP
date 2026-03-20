public class WrapperDemo {
    public static void main(String[] args) {
        int a = 5;
        // Autoboxing
        Integer obj = a;
        // Unboxing
        int b = obj;

        System.out.println("primitive int: " + a);
        System.out.println("wrapper Integer: " + obj);
        System.out.println("Unboxed int: " + b);
    }
}