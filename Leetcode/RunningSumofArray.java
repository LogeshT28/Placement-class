

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumofArray {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=  s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
                    // int sum=0;
                    // int num[] = new int[n];
                    // for(int i=0;i<n;i++){
                    //     sum+=arr[i];
                    //     num[i] = sum;
                    // }
                    // System.out.println(Arrays.toString(num));

        
            int sum[] = new int[n];
            sum[0] = arr[0];
            for(int i=1;i<n;i++){
                sum[i] = sum[i-1]+arr[i];
            }
            System.out.println(Arrays.toString(sum));       
    }
}
