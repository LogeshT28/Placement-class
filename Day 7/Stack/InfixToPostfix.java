import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    static int priority(char c){
        int n = 0;
        switch (c){
            case '$':
            case '^':
                n = 4;
                break;
            case '*':
            case '/':
                n = 3;
                break;
            case '+':
            case '-':
                n = 2;
                break;
            case '=':
                n = 1;
                break;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> postfix = new Stack<>();
        String s = sc.nextLine();
        sc.close(); // Close the scanner to avoid resource leak

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                System.out.print(c + " ");
            } else {
                if (c == '(') {
                    postfix.push(c);
                } else if (c == ')') {
                    while (!postfix.isEmpty() && postfix.peek() != '(') {
                        System.out.print(postfix.pop() + " ");
                    }
                    postfix.pop(); // Pop the '('
                } else {
                    while (!postfix.isEmpty() && priority(postfix.peek()) >= priority(c)) {
                        System.out.print(postfix.pop() + " ");
                    }
                    postfix.push(c);
                }
            }
        }

        // Pop all the remaining operators from the stack
        while (!postfix.isEmpty()) {
            System.out.print(postfix.pop() + " ");
        }
    }
}
