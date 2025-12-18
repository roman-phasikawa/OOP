public class ImplicitType 
{
    public static void main(String[] args) 
    {
       int i = 42;
        double d = i; // int -> double (widening)
        System.out.println("int to double: i=" + i + " -> d=" + d);

        char c = 'A';
        int ci = c; // char -> int (unicode code point)
        System.out.println("char to int: c='" + c + "' -> ci=" + ci);

        byte b = 10;
        int bi = b; // byte -> int (smaller integral promoted to int)
        System.out.println("byte to int: b=" + b + " -> bi=" + bi);

        long l = 1_000_000_000_000L;
        float lf = l; // long -> float (widening, may lose precision)
        System.out.println("long to float (possible precision loss): l=" + l + " -> lf=" + lf);

        float f = 3.14f;
        double fd = f; // float -> double
        System.out.println("float to double: f=" + f + " -> fd=" + fd);

        // In expressions, smaller integral types are promoted to int
        byte x = 5, y = 6;
        int sum = x + y; // x and y promoted to int before addition
        System.out.println("byte + byte promoted to int: " + x + " + " + y + " = " + sum);
    }
}
