//Write a program to demonstrate the concept of passing by value.
public class PassByValue {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        PassByValue obj=new PassByValue();
        obj.sum(a,b);
    }

    void sum(int a,int b){
        int c=a+b;
        System.out.println("Inside the method:"+c);
    }
}


