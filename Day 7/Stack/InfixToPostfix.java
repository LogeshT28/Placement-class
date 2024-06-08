import java.util.Scanner;
import java.util.Stack;
public class InfixToPostfix {
    public static void main(String[] args) {
        Stack<Integer> stack = new  Stack<>();
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        for(int i=0;i<a.length();i++){
                char c = a.charAt(i);
                if(c>='0' && c<='9'){
                    stack.push(c-'0');
                }
                else{
                    int n = stack.pop();
                    int n1= stack.pop();
                    if(c == '+'){
                        stack.push(n+n1);
                    }
                    else if(c == '-'){
                        stack.push(n-n1);
                    }
                    else if(c == '*'){
                        stack.push(n*n1);
                    }
                    else if(c == '/'){
                        stack.push(n/n1);
                    }
                }
        }
        System.out.println(stack);

    }
}
