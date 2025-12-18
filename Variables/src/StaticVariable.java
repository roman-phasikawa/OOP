public class StaticVariable {
    static int a=5;
    void staticMethod(){
        int b=5;
        System.out.println("A="+a);
        System.out.println("B="+b);
        System.err.println();
        a++;
        b++;
    }
    public static void main(String[] args) {
        StaticVariable obj=new StaticVariable();
        obj.staticMethod();
        obj.staticMethod();
    }
}
