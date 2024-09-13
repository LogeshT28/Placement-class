import java.util.Scanner;
import java.util.Stack;

public class ValidPeranthiese {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Stack<Character>  stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='(' || c=='{' ||  c=='['){
                stack.push(c);
            }
            else if(c==')' || c=='}' ||  c==']'){
                if(stack.isEmpty()){
                    System.out.println("False");
                    return;
                }
                char top=stack.pop();
                if(c=='(' && top!=')' || c=='[' && top!=']' || c=='{' && top!='}'){
                    System.out.println("False");
                    return;
                }
            }
        }

        if(stack.isEmpty()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
                    return;
        }
    }
}
