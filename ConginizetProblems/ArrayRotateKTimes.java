
// Roate Array Without use Array and String.
import java.util.*;
public class ArrayRotateKTimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int pv=1;
        while(n/pv > 9){
            pv = pv *10;
        }
        for(int i=0;i<k;i++){
            int rem = n%10;
            n = n /10;
            n = rem*pv+n;
        }

        System.out.println(n);
    }
}
