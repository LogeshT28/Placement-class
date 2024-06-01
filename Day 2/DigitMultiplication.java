import java.util.Scanner;
public class DigitMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num= s.nextInt();
        int res = 1;
        while (num!=0) {
            res = res*(num%10);
            num= num/10;
            // System.out.println(res+" ");
        }
        System.out.println(res);
    }
}
