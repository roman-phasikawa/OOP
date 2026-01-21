public class StringBufferMethods {
    public static void main(String[] args){
        StringBuffer stringBuffer=new StringBuffer();
        System.out.println("Length of StringBuffer is: "+stringBuffer.length());
        System.out.println("Capacity of StringBuffer is: "+stringBuffer.capacity());

        StringBuffer sb=new StringBuffer("Hello Java");
        System.out.println("Length of StringBuffer is: "+sb.length());
        System.out.println("Capacity of StringBuffer is: "+sb.capacity());

        System.out.println("Original Text: "+sb);
        sb.append(" Programming");
        System.out.println(sb);

        sb.insert(4, "Programming");
        System.out.println(sb);

        sb.replace(0, 5, "Hi");
        System.out.println("Replace Text: "+sb);

        sb.reverse();
        System.out.println("Reversed StringBuffer Content: "+sb);

        sb.delete(2, 5);
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);
    }
}
