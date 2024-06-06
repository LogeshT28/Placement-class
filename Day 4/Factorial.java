    import java.util.Scanner;

    public class Factorial {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int temp=n;
            int res=0;
            while (temp!=0) {
                int digit = temp%10;
                int fact=1;
                for(int i=1;i<=digit;i++){
                        fact*=i;
                }
                res+=fact;
                temp/=10;
            }
            System.out.println(res);

        }
    }
