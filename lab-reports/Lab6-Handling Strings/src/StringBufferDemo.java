// WAP to demonstrate the concept of String buffer.
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" world");
        System.out.println("After append: " + sb);
        sb.insert(5, " java");
        System.out.println("After insert: " + sb);
        sb.replace(6, 10, "program");
        System.out.println("After replace: " + sb);
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
