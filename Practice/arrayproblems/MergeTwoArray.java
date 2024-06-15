package Practice.arrayproblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
    public static int[] merge(int[] arr1, int[] arr2) {
        int mergeArray[] = new int[arr1.length + arr2.length];
        int i = 0, k = 0, j = 0;
        while (i < arr1.length || j < arr2.length) {
            if (i < arr1.length && arr1[i] <= arr2[j]) {
                mergeArray[k++] = arr1[i++];
            } else {
                mergeArray[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            mergeArray[k++] = arr1[i++];

        }
        while (j < arr2.length) {
            mergeArray[k++] = arr2[j++];

        }

        Arrays.sort(mergeArray);
        return mergeArray;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int arr1[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = s.nextInt();
        }
        int size2 = s.nextInt();
        int arr2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = s.nextInt();
        }
        int mergeArray[] = merge(arr1, arr2);

        for (int num : mergeArray) {
            System.out.print(num + " ");
        }
    }
}
