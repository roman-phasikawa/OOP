public class ThisKeyword {
    int id;
    String name;
    int age;
    ThisKeyword(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        ThisKeyword person = new ThisKeyword(1, "Alice", 30);
        person.display();
    }
}
