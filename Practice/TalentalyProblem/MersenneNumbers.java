// java_Sum of all Mersenne Numbers present in an array
// Problem Statement:

// Given an array of integers arr[], the task is to Find the sum of all the Mersenne numbers from the array. A number is a Mersenne number if it is greater than 0 and is one less than some power of 2. First few Mersenne numbers are 1, 3, 7, 15, 31, 63, 127, ...
// Examples:
// Input: arr[] = {17, 6, 7, 63, 3}
// Output: 73
// Only 7, 63 and 3 are Mersenne numbers i.e. 7 + 63 + 3 = 73
// Input: arr[] = {1, 3, 11, 45}
// Output: 4

// Input Format:

// Enter the array elements

// Output Format:

// Display the sum of all the Mersenne numbers from the array

// Constraints:
// N/A
// Sample Input :

// 5
// 17 6 7 63 3

// Sample Output :

// 73

import java.util.Scanner;

class MersenneNumbers{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int j=0;
            while(Math.pow(2,j)-1 <= a[i]){
                if(Math.pow(2,j)-1 == a[i]){
                    //System.out.println(a[i]);
                    sum+=a[i];
                }
                j++;
            }
        }
        System.out.print(sum);
    }
}