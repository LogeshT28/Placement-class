// Kadane's Algorithm : Maximum Subarray Sum in an Array


// 269

// 3
// Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
// has the largest sum and returns its sum and prints the subarray.

// Examples
// Example 1:
// Input:
//  arr = [-2,1,-3,4,-1,2,1,-5,4] 

// Output:
//  6 

// Explanation:
//  [4,-1,2,1] has the largest sum = 6. 

// Examples 2:
// Input:
//  arr = [1] 

// Output:
//  1 

// Explanation:
//  Array has only one element and which is giving positive sum of 1.

package Practice.arrayproblems;

import java.util.Scanner;

public class MaxSumWithContigusNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=  s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<size-1;i++){
            sum=arr[i]+arr[i+1];
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }
}

       
   