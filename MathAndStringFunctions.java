public class MathAndStringFunctions {
    public static void main(String[] args) {
        // Math Functions
        double number = -25.5;
        double radians = Math.toRadians(45); // Converts degrees to radians

        System.out.println("Math Functions:");
        System.out.println("Absolute value of " + number + ": " + Math.abs(number));
        System.out.println("Square root of 16: " + Math.sqrt(16));
        System.out.println("2 to the power of 3: " + Math.pow(2, 3));
        System.out.println("Maximum of 10 and 20: " + Math.max(10, 20));
        System.out.println("45 degrees in radians: " + radians);
        System.out.println("Sine of 45 degrees: " + Math.sin(radians));
        System.out.println();

        // String Functions
        String text = "Hello, Java!";
        String additionalText = " It's awesome.";

        System.out.println("String Functions:");
        System.out.println("Original Text: " + text);
        System.out.println("Length of the text: " + text.length());
        System.out.println("Character at index 7: " + text.charAt(7));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Concatenation: " + text.concat(additionalText));
        System.out.println("Substring (index 7 to end): " + text.substring(7));
        System.out.println("Does it contain 'Java'? " + text.contains("Java"));
        System.out.println("Replace 'Java' with 'World': " + text.replace("Java", "World"));
    }
}
