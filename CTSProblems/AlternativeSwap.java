import java.util.Scanner;

public class AlternativeSwap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // Read the input number
        int alter = 0;
        int pv = 1;  // Position value multiplier (starting from ones place)
        int count = 0;
        int copy = n;
        
        // Count the number of digits in the input number
        while (copy != 0) {
            count++;
            copy /= 10;
        }
        
        int ldigit = 0;  // Store the last digit if the number of digits is odd
        if (count % 2 == 1) {
            ldigit = n % 10; // Get the last digit
            n = n / 10;      // Remove the last digit from the number
        }

        // Swap adjacent digits
        while (n != 0) {
            int rem = n % 100;            // Get the last two digits
            int swap = (rem % 10) * 10 + (rem / 10); // Swap the two digits
            alter = swap * pv + alter;    // Add the swapped number to the result
            pv = pv * 100;                // Update position value
            n = n / 100;                  // Remove the last two digits
        }

        // If there was an odd number of digits, add the last digit
        if (count % 2 == 1) {
            alter = alter * 10 + ldigit;
        }

        System.out.println(alter);
    }
}
