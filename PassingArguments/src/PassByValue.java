public class PassByValue {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Before method call: " + a);
        PassByValue obj = new PassByValue();
        obj.modifyValue(a);
        System.out.println("After method call: " + a);
    }

    public void modifyValue(int b) {
        b = 20;
        System.out.println("Inside method: " + b);
    }
}
