package Leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = removeDuplicates(nums);

        // Print the first k elements
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int write_index = 2;  // Start from the third element

        for (int read_index = 2; read_index < nums.length; read_index++) {
            // If the current element is not the same as the element two places before write_index,
            // then it is valid to keep this element.
            if (nums[read_index] != nums[write_index - 2]) {
                nums[write_index] = nums[read_index];
                write_index++;
            }
        }
        // System.out.println(write_index);
        // for (int i = 0; i < write_index; i++) {
        //     System.out.print(nums[i] + " ");
        // }
        return write_index;
    }
}

