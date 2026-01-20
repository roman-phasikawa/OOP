final class SecureSystem {
    void display(){
        System.out.println("Secure System");
    }    
}
// class HackSystem extends SecureSystem{
//     void display(){
//         System.out.println("Hack System");
//     }
// }
public class FinalClass {
    public static void main(String[] args) {
        SecureSystem obj=new SecureSystem();
        obj.display();
    }
}
