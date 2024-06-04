
import java.util.Scanner;

public class ReverseANum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int digit = s.nextInt();
        int temp=0,rev=0;
        while(digit!=0){
            temp = digit%10;
            rev = (rev*10)+temp;
            digit/=10;
        }
        System.out.println(rev);
    }
}
