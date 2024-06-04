import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rev=0,temp=0;
        int n1 = n;
        while(n1!=0){
            temp = n1%10;
            rev  = (rev*10)+temp;
            n1/=10;
        }
        if(n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");

        }
    }
}
