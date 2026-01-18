public class ExplicitType {
    public static void main(String[] args) {
        double d=99.9;
        int i=(int)d;
        byte b=(byte)d;
        short s=(short)d;
        float f=(float)d;
        System.out.println("Explicit type casting");
        System.out.println("double to int:"+i);
        System.out.println("double to byte:"+b);
        System.out.println("double to short:"+s);
        System.out.println("double to float:"+f);

        //double->float->long->int->short->byte

    }

}
