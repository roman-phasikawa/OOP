class ParentClass{
    void showData(){
        System.out.println("Inside ParentClass Method");
    }

}
class ChildClass extends ParentClass{
    void showData(){
        //super.showData();
        System.out.println("Inside ChildClass Method");
    }

}
public class MethodOverriding {
    public static void main(String[] args) {
        ParentClass ref=new ChildClass();
        ref.showData();
        
    }
}
