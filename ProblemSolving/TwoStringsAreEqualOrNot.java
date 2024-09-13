import java.util.Scanner;

public class TwoStringsAreEqualOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        
        // Check if str2 is the reverse of str1
        if (str1.length() == str2.length() && new StringBuilder(str1).reverse().toString().equals(str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        s.close();
    }
}
