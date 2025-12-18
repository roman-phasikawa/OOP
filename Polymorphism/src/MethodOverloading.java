public class MethodOverloading {
    void display(){
        System.out.println("No params");
    }
    void display(int a){
        System.out.println("A="+a);
    }
    void display(int a,int b){
        System.out.println("A+B+"+(a+b));
    }
    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.display();
        obj.display(10);
        obj.display(10,23);
        
    }
}
