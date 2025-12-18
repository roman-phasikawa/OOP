class A{
    public void display(){
        System.out.println("Method in Superclass A");
    }
}
class B{
        A objA = new A(){
            public void display(){
                System.out.println("Overridden Method in Anonymous Inner Class");
            }
        };
        void show(){
            objA.display();
        }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        B objB = new B();
        objB.show();
    }
}
