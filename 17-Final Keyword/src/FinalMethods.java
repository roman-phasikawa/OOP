class Company{
    final void comment(){
        System.out.println("Only Company admin can access");
    }
}
public class FinalMethods extends Company{
    // void comment(){
    //     System.out.println("Intern trying to acess admin!!");
    // }
    public static void main(String[] args) {
        FinalMethods obj=new FinalMethods();
        obj.comment();
    }
}
