import java.util.*;
class DecimalToBinaryConvert{
    public static void decimaltobinaryBuildin(int n){
        String binary = Integer.toBinaryString(n);
        System.out.println("Binary value of " + n + " is: " + binary);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        decimaltobinaryBuildin(n);
        String res="";
        while(n!=0){
            int digit = n%2;
            res = digit+res;
            n/=2;
        }
        System.out.println(res);

    }
}