import java.util.Scanner;

import java.util.Stack;

public class WaterReservation {

    public static int checkGates(String str) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                // Opening gate, push to stack
                stack.push(c);
            } else if (c == ')') {
                // Closing gate, check if there is a matching opening gate
                if (stack.isEmpty()) {
                    // No matching opening gate
                    return -1;
                } else {
                    // Matching opening gate found, pop from stack
                    stack.pop();
                    count++; // Valid pair found
                }
            }
        }

        // If the stack is not empty, it means there are unmatched opening gates
        if (!stack.isEmpty()) {
            return -1;
        }

        return count;
    }

    public static void main(String[] args) {
        // Sample input
        String str = "((()())())()";
        
        // Output the result
        System.out.println(checkGates(str)); // Expected output: 6
    }
}

