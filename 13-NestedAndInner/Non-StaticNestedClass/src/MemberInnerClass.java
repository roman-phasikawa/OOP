class OuterClass {
    void display() {
        InnerClass objInner = new InnerClass();
        objInner.show();
        // Use inner class instance
    }
    class InnerClass {
        void show() {
            System.out.println("Inside InnerClass");
        }
    }
}
public class MemberInnerClass {
    public static void main(String[] args) {
        OuterClass objOuter = new OuterClass();
        objOuter.display();
    }
    
}
