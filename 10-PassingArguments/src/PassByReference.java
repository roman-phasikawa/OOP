public class PassByReference {
    int a=10;
    public static void main(String[] args) {
        PassByReference obj = new PassByReference();
        System.out.println("Before method call: " + obj.a);
        PassByReference obj1;
        obj1 = obj;
        obj1.modifyValue(5);
        System.out.println("After method call: " + obj.a);
    }
    void modifyValue(int b) {
            a=a+b;
    }
}
