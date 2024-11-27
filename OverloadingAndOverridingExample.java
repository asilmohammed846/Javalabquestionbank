// Method Overloading and Overriding Example
class Calculator {

    // Method Overloading: Same method name with different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// A child class extending the Calculator class
class AdvancedCalculator extends Calculator {

    // Method Overriding: Redefining the add method in the child class
    @Override
    public int add(int a, int b) {
        System.out.println("Using AdvancedCalculator add method");
        return a + b + 10; // Adds an additional 10 for demonstration
    }
}

public class OverloadingAndOverridingExample {
    public static void main(String[] args) {
        // Demonstrating Method Overloading
        Calculator calc = new Calculator();
        System.out.println("Sum (2 integers): " + calc.add(5, 10));          // Calls int add(int, int)
        System.out.println("Sum (2 doubles): " + calc.add(5.5, 10.5));      // Calls double add(double, double)
        System.out.println("Sum (3 integers): " + calc.add(5, 10, 15));     // Calls int add(int, int, int)

        // Demonstrating Method Overriding
        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("Sum (Overridden): " + advCalc.add(5, 10));      // Calls overridden method
    }
}
