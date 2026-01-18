class SuperClass{
    int n1,n2,r;
    void sum(){
        n1 = 10;
        n2 = 20;
        r = n1 + n2;
        System.out.println("Sum: " + r);
    }
    void sub(){
        r = n2 - n1;
        System.out.println("Subtraction: " + r);
    }
}
class SubClass1 extends SuperClass{
    void mul(){
        r = n1 * n2;
        System.out.println("Multiplication: " + r);
    }
}
class SubClass2 extends SubClass1{
    void div(){
        r = n2 / n1;
        System.out.println("Division: " + r);
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        SubClass2 obj = new SubClass2();
        obj.sum();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
