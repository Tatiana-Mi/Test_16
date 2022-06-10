package Test_15;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna", "Wilson");
        System.out.println(anna.getCount());

        Person david = new Person("David", "Peterson");
        System.out.println(anna.getCount());
        System.out.println(david.getCount());

        Person steve = new Person("Steve", "Harvey");
        System.out.println(anna.getCount());
        System.out.println(david.getCount());
        System.out.println(steve.getCount());

        anna.hello();

    }
}
