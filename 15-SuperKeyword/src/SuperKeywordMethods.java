class SuperKeywordMethods1{
    int n1=14,n2=90;
    int res;
    void display(){
        
        res=n1+n2;
        System.out.println("Sum:"+res);
    }
}
class SuperKeywordMethods2 extends SuperKeywordMethods1{
    void display(){
        super.display();
        res=n2-n1;
        System.out.println("Sub:"+res);
    }
}
public class SuperKeywordMethods {
    public static void main(String[] args) {
        SuperKeywordMethods2 obj=new SuperKeywordMethods2();
        obj.display();
    }
}
