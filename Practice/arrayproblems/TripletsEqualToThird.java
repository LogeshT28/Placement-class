package Practice.arrayproblems;

import java.util.Scanner;

public class TripletsEqualToThird {

    // Function to find and print all triplets in the array
    public static void findTriplets(int[] arr) {
        int n = arr.length;
        boolean found = false;

        // Iterate through each triplet combination
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] == arr[k] || arr[i] + arr[k] == arr[j] || arr[j] + arr[k] == arr[i]) {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No triplets found.");
        }
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

        // Find and print triplets
        findTriplets(arr);
    }
}

