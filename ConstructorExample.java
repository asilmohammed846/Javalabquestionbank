class Person {
    String name;
    int age;

    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Using the default constructor
        Person person1 = new Person();
        person1.displayInfo();

        System.out.println();

        // Using the parameterized constructor
        Person person2 = new Person("Alice", 25);
        person2.displayInfo();
    }
}
