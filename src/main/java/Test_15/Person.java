package Test_15;

public class Person {
    private String name;
    private String lastName;
    private int count;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCount() {
        return count;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        count++;

        }

    public static void hello() {
        System.out.println("Hello");

    }
}
