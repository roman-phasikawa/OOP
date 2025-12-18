public class AssignmentOperator {
    public static void main(String[] args) {
        int a=10, b=16, c;
        System.out.println(c=a);
        System.out.println(c+=a);
        System.out.println(c-=a);
        System.out.println(c*=a);
        System.out.println(c/=a);
        System.out.println(b%=a);
        System.out.println(c<<=2);      //c=c<<a
        System.out.println(c>>=3);
        System.out.println(c&=b);
        System.out.println(c^=b);
        System.err.println(c|=b);

    }
}
