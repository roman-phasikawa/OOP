class A{
    void display(){
        System.out.println("Class A method called");
    }
}
class B extends A{
    void show(){
        System.out.println("Class B method called");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.show();
    }
}
