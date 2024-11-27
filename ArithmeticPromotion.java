public class ArithmeticPromotion {
    public static void main(String[] args) {
        // Example 1: Promotion from byte to int
        byte b1 = 10;
        byte b2 = 20;
        // The result of b1 + b2 is promoted to int
        int result1 = b1 + b2;
        System.out.println("Result of byte addition (b1 + b2): " + result1);

        // Example 2: Promotion from short to int
        short s1 = 3000;
        short s2 = 4000;
        // The result of s1 * s2 is promoted to int
        int result2 = s1 * s2;
        System.out.println("Result of short multiplication (s1 * s2): " + result2);

        // Example 3: Mixing int and double
        int i = 5;
        double d = 2.5;
        // The result of i * d is promoted to double
        double result3 = i * d;
        System.out.println("Result of int and double multiplication (i * d): " + result3);

        // Example 4: Promotion from char to int
        char c = 'A'; // ASCII value of 'A' is 65
        int result4 = c + 5;
        System.out.println("Result of char addition (c + 5): " + result4);

        // Example 5: Mixed data types (byte, short, char)
        byte b = 10;
        char ch = 'B'; // ASCII value of 'B' is 66
        short s = 20;
        int result5 = b + ch + s; // All promoted to int
        System.out.println("Result of mixed addition (b + ch + s): " + result5);
    }
}
