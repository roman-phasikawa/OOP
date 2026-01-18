public class ScopeAndLifetime {
    public static void main(String[] args) {
        int a=10;
        if(a==10){
            int b=20;
            System.out.println("A is equal");
            a=b-5;

        }
        System.out.println("Value of A="+a);
        // System.out.println("Value of B="+b);
    }

}
