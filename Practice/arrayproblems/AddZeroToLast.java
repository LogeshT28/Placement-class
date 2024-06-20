package Practice.arrayproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * AddZeroToLast
 */
public class AddZeroToLast {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=  s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }
        System.out.println("J "+j);
        while(j<n){
            arr[j++]=0;
        }
        System.out.println(Arrays.toString(arr)); 
    }
}