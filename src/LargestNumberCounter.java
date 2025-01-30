import java.util.Scanner;

public class LargestNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE; // Initialize with the smallest possible integer
        int count = 0;

        System.out.print("Enter numbers (end with 0): ");

        while (true) {
            int num = scanner.nextInt(); // Read input

            if (num == 0) break; // Stop when 0 is entered

            if (num > maxNumber) {
                maxNumber = num; // Update maxNumber
                count = 1;       // Reset count to 1
            } else if (num == maxNumber) {
                count++; // Increment count if same as maxNumber
            }
        }

        // Output results
        if (maxNumber != Integer.MIN_VALUE) {
            System.out.println("The largest number is " + maxNumber);
            System.out.println("The occurrence count of the largest number is " + count);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        scanner.close();
    }
}
