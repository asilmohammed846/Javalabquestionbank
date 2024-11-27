import java.util.Scanner;

public class MethodExample {

    // User-defined method to calculate the sum of two numbers
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // User-defined method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using a predefined method (Scanner for user input)
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calling user-defined method to calculate the sum
        int sum = calculateSum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Calling user-defined method to check if the sum is even
        if (isEven(sum)) {
            System.out.println("The sum is an even number.");
        } else {
            System.out.println("The sum is an odd number.");
        }

        // Using predefined method (Math.sqrt) to calculate the square root of the sum
        double squareRoot = Math.sqrt(sum);
        System.out.println("The square root of the sum is: " + squareRoot);

        sc.close();
    }
}
