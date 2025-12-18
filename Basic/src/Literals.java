public class Literals 
{
    public static void main(String[] args)
    {
        //Integral literals
        int a=101;      //decimal
        int b=0100;     //octal
        int c=0xFace;   //hexa-decimal (0XFACE)
        int d=0b1111;   //binary
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        double e=123.45;    //floating-point
        System.out.println(e);

        //Char literals
        char ch='a';
        // char ch=062;
        // char ch='\u0061';
        // char ch='\n';
        System.out.println(ch);

        //String literals
        String s="Hello";
        System.out.println(s);

        //Boolean litrals
        boolean t=true;
        System.out.println(t);

    }
}
