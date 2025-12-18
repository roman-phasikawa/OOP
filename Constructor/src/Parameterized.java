class Student{
    public int id;
    public String name;
    public int age;
    public Student(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
    public void display(){
        System.out.println("ID:"+id+"\tName:"+name+"\tAge:"+age);

    }
}
public class Parameterized {
        public static void main(String[] args) {
            Student student1 = new Student(101, "Ram", 19);
            Student student2 = new Student(102, "Shyam", 20);
            student1.display();
            student2.display();
        }
}
