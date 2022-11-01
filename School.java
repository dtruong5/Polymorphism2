public class School {
    public static void main(String[] args) {
        Student s1 = new Student("Dat Truong", 25);
        s1.study();
        s1.reading();
        s1.breathing();

        Teacher t1 = new Teacher();
        t1.teaching();
        t1.breathing();
    }

}
