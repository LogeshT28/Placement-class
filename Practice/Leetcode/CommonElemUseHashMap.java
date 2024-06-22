package Practice.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CommonElemUseHashMap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the number of elements for the first array: ");
        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the First Array elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = s.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the number of elements for the second array: ");
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the Second Array elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = s.nextInt();
        }

        // Input for the third array
        System.out.print("Enter the number of elements for the third array: ");
        int n3 = s.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Enter the Third Array elements:");
        for (int i = 0; i < n3; i++) {
            arr3[i] = s.nextInt();
        }

        // Using a HashMap to track the frequency of elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Process the first array
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Process the second array
        for (int num : arr2) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Process the third array
        for (int num : arr3) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Collect elements that appear at least twice
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() >= 1) {
                result.add(entry.getKey());
            }
        }

        // Print the result
        System.out.println("Common elements in at least two arrays: " + result);
    }
}
