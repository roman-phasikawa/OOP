public class MemberLocalInner {
    int a=100;
    void myMethod(){
        class LocalInnerClass{
            void display(){
                System.out.println("a = " + a);
                System.out.println("It's Local Inner Class" );
            }
        }
        LocalInnerClass objLocalInner = new LocalInnerClass();
        objLocalInner.display();
    }
    public static void main(String[] args) {
        MemberLocalInner objMemberLocalInner = new MemberLocalInner();
        objMemberLocalInner.myMethod();
    }
}
