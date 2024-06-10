import java.util.Scanner;

public class FountainPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Print the top half of the pattern including the middle line
        for (int i = 1; i <= n; i++) {
            printLine(n, i);
        }
        
        // Print the bottom half of the pattern
        for (int i = n-1; i >= 1; i--) {
            printLine(n, i);
        }
        
        scanner.close();
    }
    
    private static void printLine(int n, int i) {
        // Calculate the number of spaces before the first number
        int spacesBefore = i - 1;
        // Calculate the number of spaces between the two numbers
        int spacesBetween = 2 * (n - i);
        
        // Print the leading spaces
        for (int j = 0; j < spacesBefore; j++) {
            System.out.print(" ");
        }
        
        // Print the first number
        System.out.print(i);
        
        // Print the spaces between the two numbers, if there are any
        if (spacesBetween > 0) {
            for (int j = 0; j < spacesBetween; j++) {
                System.out.print(" ");
            }
            // Print the second number
            System.out.print(i);
        }
        
        // Move to the next line
        System.out.println();
    }
}
