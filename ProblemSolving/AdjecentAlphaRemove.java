import java.util.Scanner;
import java.util.Stack;

class AdjecentAlphaRemove{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        Stack<Character> stack = new Stack<>();
        for(char c:str.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.peek()-c)==32){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        String res ="";
        for(char c:stack){
            res +=c;
        }

        System.out.println(res);
    }
}