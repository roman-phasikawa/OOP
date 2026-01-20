public class AbstractClassExtendsDemo extends AbstactClassDemo{
    @Override
    public void add() {
        System.out.println(10+20);
    }
    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        AbstractClassExtendsDemo obj = new AbstractClassExtendsDemo();
        obj.add();
        obj.sum(10,40);
    }
}
