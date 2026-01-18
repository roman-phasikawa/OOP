class SuperKeywordVariable1{
    int a=5;
}
class SuperKeywordVariable2 extends SuperKeywordVariable1{
    int a=10;
    void display(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class SuperKeywordVariable {
    public static void main(String[] args) {
        SuperKeywordVariable2 obj=new SuperKeywordVariable2();
        obj.display();
    }

}
