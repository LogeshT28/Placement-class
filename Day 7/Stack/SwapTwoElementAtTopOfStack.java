import java.util.Scanner;
import java.util.Stack;

public class SwapTwoElementAtTopOfStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<size;i++){
            int element = s.nextInt();
            stack.push(element);
        }
        System.out.println("Original Stack :"+stack);
        int a = stack.pop();
        int b = stack.pop();
        stack.push(a);
        stack.push(b);
        System.out.println("Swaped Stack :"+stack);
       
    }
}
