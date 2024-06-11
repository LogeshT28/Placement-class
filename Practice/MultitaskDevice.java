package Practice;
import java.util.Scanner;

public class MultitaskDevice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number
        int number = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        // Convert number to String
        String numberStr = String.valueOf(number);

        // Input: Task code
        char taskCode = scanner.nextLine().toUpperCase().charAt(0);

        switch (taskCode) {
            case 'A':
                sumFirstLastDigit(numberStr);
                break;
            case 'B':
                checkPalindrome(numberStr);
                break;
            case 'C':
                countDigits(numberStr);
                break;
            case 'D':
                printDigitsAsWords(numberStr);
                break;
            default:
                System.out.println("Invalid task code");
        }
        
        scanner.close();
    }

    private static void sumFirstLastDigit(String numberStr) {
        int firstDigit = Character.getNumericValue(numberStr.charAt(0));
        int lastDigit = Character.getNumericValue(numberStr.charAt(numberStr.length() - 1));
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of first and last digit: " + sum);
    }

    private static void checkPalindrome(String numberStr) {
        String reversedStr = new StringBuilder(numberStr).reverse().toString();
        if (numberStr.equals(reversedStr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    private static void countDigits(String numberStr) {
        int count = numberStr.length();
        System.out.println("Number of Digits: " + count);
    }

    private static void printDigitsAsWords(String numberStr) {
        for (char digitChar : numberStr.toCharArray()) {
            switch (digitChar) {
                case '0':
                    System.out.print("zero ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
            }
        }
        System.out.println();
    }
}
