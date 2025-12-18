public class StaticNestedClass 
{
    int a=10;
    static int b=20;
    static class StaticNestedDemo
    {
        void display(){
            // System.out.println("a: "+a); // Non-static variable 'a' cannot be referenced from a static context
            System.out.println("b: "+b);
        }
    }
        public static void main(String[] args) 
        {
            StaticNestedClass.StaticNestedDemo obj = new StaticNestedClass.StaticNestedDemo();
            obj.display();
        }
}
