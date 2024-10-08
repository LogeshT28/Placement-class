import java.util.*;
class ReverseNum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // int res=0;
        // int count=0;
        // while(n!=0){
        //     int d = n%10;
        //     res =res *10+d;
        //     n/=10; 
        //     count++;
        // }
        // System.out.println(res);
        int p1=1;
        //int p2=1;
        int rev=0;
        //12345
        while(n/p1 != 0){
            int rem = n%(p1*10);//54
            int dig =  rem/p1;//5
            rev =rev*10+dig;//5
            p1=p1*10; 
        }
        System.out.println(rev);
        System.out.println(n);
    }
}
