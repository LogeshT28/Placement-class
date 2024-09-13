import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String binary = Integer.toBinaryString(n);
        String reverseBinary= new StringBuilder(binary).reverse().toString();
        System.out.println(Integer.parseInt(reverseBinary,2));
    }
}
