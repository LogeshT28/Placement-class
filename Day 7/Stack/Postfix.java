import java.util.Scanner;
import java.util.Stack;
public class Postfix {
    public static void main(String[] args) {
        Stack<Integer> stack = new  Stack<>();
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        for(int i=0;i<a.length();i++){
                char c = a.charAt(i);
                int k=0;
                if(c>='0' && c<='9'){
                    stack.push(c-'0');
                }
                else{
                    
                    switch (c) {
                        case '+':
                            k = stack.pop() + stack.pop();
                            stack.push(k);
                            break;
                        case '-':
                            k = stack.pop() - stack.pop();
                            stack.push(k);
                            break;
                        case '*':
                            k = stack.pop() * stack.pop();
                            stack.push(k);
                            break;
                        case '/':
                            k = stack.pop() / stack.pop();
                            stack.push(k);
                            break;
                        default:
                            // Handle unexpected characters
                            throw new IllegalArgumentException("Invalid operator: " + c);
                    }
                                          
                    // k=stack.pop()/stack.pop();
                        // stack.push(k);
                    }
                }
                System.out.println(stack);

            }    }

