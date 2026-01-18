class SuperKeywordConstructors1{
    SuperKeywordConstructors1(String string){
        System.out.println("Constructors1 named:"+string);   
    }
}
class SuperKeywordConstructors2 extends SuperKeywordConstructors1{
    SuperKeywordConstructors2(String string){
        super(string);
        System.out.println("Constructors2 named:"+string);   
    }
    void show(){

    }

}
public class SuperKeywordConstructors {
    public static void main(String[] args) {
        //when object of child class is creatd, it automatically calls the parent class default-constructor before its own
        SuperKeywordConstructors2 obj=new SuperKeywordConstructors2("Super");
        obj.show();
    }
}
