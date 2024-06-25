package Practice.arrayproblems;

import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=  s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int max=Integer.MIN_VALUE;
       // Method 1:
        // for(int i=0;i<size;i++){
        //     for(int j=i;j<size;j++){
        //         int sum=0;
        //         for(int k=i;k<=j;k++){
        //             sum+=arr[k];
        //         }
        //         max = Math.max(max, sum);
        //     }
        // }


        // Method 2;
        // for(int i=0;i<size;i++){
        //     int sum=0;
        //     for(int j=i;j<size;j++){
        //         sum+=arr[j];
        //         max = Math.max(max, sum);
        //     }
        // }

        //Method 3:
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
           // max = Math.max(max, sum);
           if(sum > max){
            max =sum;
           }
           if(sum<0){
            sum=0;
           }
        }
            //Kadane's Alogrithm.
        System.out.println(max);

    }
}
