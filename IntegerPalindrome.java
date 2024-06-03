public class IntegerPalindrome {
    public static void main(String[] args) {
        int a = 123;
        int temp=0;
        while (a!=0) {
            int digit = a%10;
            temp=(temp*10)+digit;
            a= a/10;
        }
        System.out.println(temp);
    }
}
