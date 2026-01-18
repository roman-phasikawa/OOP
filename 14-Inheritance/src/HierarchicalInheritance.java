class SuperClassH {
    void display() {
        System.out.println("This is the SuperClass");
    }
}
class SubClass1H extends SuperClassH {
    void display() {
        System.out.println("This is SubClass1");
    }
}
class SubClass2H extends SuperClassH {
    void display() {
        System.out.println("This is SubClass2");
    }
}
class SubClass3H extends SuperClassH {
    void display() {
        System.out.println("This is SubClass3");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        SubClass1H obj1 = new SubClass1H();
        obj1.display();
        SubClass2H obj2 = new SubClass2H();
        obj2.display();
        SubClass3H obj3 = new SubClass3H();
        obj3.display();
    }
}
