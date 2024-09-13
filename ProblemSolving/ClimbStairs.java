import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int  m= s.nextInt();
        int a = n/m;
        int b=n%m;
        System.out.println(a+b);
    }
}
