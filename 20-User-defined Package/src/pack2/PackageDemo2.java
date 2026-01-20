package pack2;

import pack1.PackageDemo1;

public class PackageDemo2 {
    void display(){
        System.out.println("Display");
    }
    public static void main(String[] args) {
        PackageDemo2 obj=new PackageDemo2();
        obj.display();
        PackageDemo1 abc=new PackageDemo1();
        abc.show();
    }

}
