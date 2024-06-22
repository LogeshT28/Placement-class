package Practice.arrayproblems;

import java.util.Scanner;

public class TripletsEqualToThird {

    // Function to find and print all triplets in the array
    public static void findTriplets(int[] arr) {
        int n = arr.length;
        int count=0;
        // Iterate through each triplet combination
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n ; j++) {
                int sum=arr[i]+arr[j];
                for (int k = 0; k < n; k++) {
                    if(sum==arr[k]){
                        count++;
                    }
                    }
                }
            }
            System.out.println(count);
        }

       

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        findTriplets(arr);
    }
}

