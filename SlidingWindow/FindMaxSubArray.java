package SlidingWindow;

import java.util.Scanner;

public class FindMaxSubArray {
    public static void bruteforceapproch(int[] a,int k){
        int n= a.length;
        int maxsum=0;
        for(int i=0;i<n-k+1;i++){
            int sum =0;
            for(int j=0;j<k;j++){
                sum=sum+a[i+j];
                maxsum = Math.max(maxsum, sum);
            }
        }
        System.out.println(maxsum);
    }
    public static void slideApproch(int[] a,int k){
        int maxsum = 0;
        for(int i=0;i<k;i++){
            maxsum+=a[i];
        }
        int window_sum = maxsum;
        for (int i = k; i < a.length; i++) {
            window_sum += a[i] - a[i - k];
            maxsum = Math.max(maxsum, window_sum);
        }
        System.out.println(maxsum);

    }
    public static void slideApprochMin(int[] a,int k){
        int maxsum = 0;
        for(int i=0;i<k;i++){
            maxsum+=a[i];
        }
        int window_sum = maxsum;
        for (int i = k; i < a.length; i++) {
            window_sum += a[i] - a[i - k];
            maxsum = Math.min(maxsum, window_sum);
        }
        System.out.println(maxsum);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Create the array and get the elements from the user
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        bruteforceapproch(a,k);
        slideApproch(a, k);
        slideApprochMin(a,k);
    }
}
