import java.util.Scanner;
import java.util.Stack;

public class FindElementInStack {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        //int count  = s.nextInt();
        String a = s.nextLine();
        char count = s.next().charAt(0);
        stack.push(a);
        boolean flag=false;
        for(int i=0;i<a.length();i++){
            char c= a.charAt(i);
            if(c==count){
                flag=true;
            }
        }
        if(flag){
            System.out.println("The Given Character is Present in Stack");
        }
        else{
            System.out.println("The Given Character is Not Present in Stack");
           
        }
    }
}
