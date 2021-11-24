public class EqualsDemo {
    public static void main(String[] args) {
        Student john = new Student(1, "John", "Somewhere");
        Student john2 = new Student(1, "John", "Somewhere");
        Student john3 = new Student(2, "John", "Somewhere");

        System.out.println(john.equals(john2));
        System.out.println(john.equals(john3));
    }
}
