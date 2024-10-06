//write a program to find the shortest permutation of the given number which include every digit.without zero to front.
// IP:764083
// OP:304678

import java.util.Scanner;

public class ConvertToShortestNumber {
    public String smallestNumber(int[] nums) {
        int n = nums.length;
        String[] str = new String[n];
    
        // Convert integers to strings
        for (int i = 0; i < n; i++) {
            str[i] = String.valueOf(nums[i]);
        }
    
        // Sort using custom comparator for smallest number
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String com1 = str[i] + str[j];
                String com2 = str[j] + str[i];
                
                // Swap if com1 > com2 to get the smallest combination
                if (com1.compareTo(com2) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
    
        // Handle edge case where the smallest number is "0"
        if (str[0].equals("0")) {
            return "0";
        }
    
        // Build the final result
        StringBuilder ans = new StringBuilder();
        for (String s : str) {
            ans.append(s);
        }
    
        return ans.toString();
    }
    
    public class Main {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            
            for (int i = 1; i <= 9; i++) {
                int copy = num; // Make a copy of the original number
                int con = 0; // Reset con for each digit
                while (copy != 0) { // Use copy instead of num
                    int rem = copy % 10;
                    if (rem == i) {
                        con = con * 10 + rem;
                    }
                    copy = copy / 10; // Use copy to process digits
                }
                // Print the result for the current digit
                if (con != 0) {
                    System.out.println("Digit " + i + ": " + con);
                }
            }
        }
}
}
