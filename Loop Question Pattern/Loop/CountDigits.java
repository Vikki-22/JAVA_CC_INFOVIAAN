import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close(); // Close the scanner to prevent resource leaks

        int count = 0;

        // Handle the special case of 0
        if (num == 0) {
            count = 1;
        } else {
            // Handle negative numbers by converting to positive
            if (num < 0) {
                num = -num;
            }
            // Loop to count digits
            while (num > 0) {
                num = num / 10; // Remove the last digit
                count++;        // Increment the count
            }
        }

        System.out.println("Number of digits: " + count);
    }
}