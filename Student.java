public class Student extends Person{
    String name;
    int age;

    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }
    void study(){
        System.out.println("Study");
    }
    void reading(){
        System.out.println("Reading at double speed");
    }
}
