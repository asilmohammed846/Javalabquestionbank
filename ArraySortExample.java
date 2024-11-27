import java.util.Scanner;
import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        // Create an array of the given size
        int[] array = new int[size];

        // Input elements from the user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(array);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
