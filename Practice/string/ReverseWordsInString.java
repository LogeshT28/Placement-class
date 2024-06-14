package Practice.string;

import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String a = s.nextLine();
        
        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            
            if (currentChar != ' ') {
                stack.push(currentChar);
            } else {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(" "); // print space after reversing the word
            }
        }
        
        // Pop and print any remaining characters in the stack (for the last word)
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        
        System.out.println(); // print newline at the end
    }
}
