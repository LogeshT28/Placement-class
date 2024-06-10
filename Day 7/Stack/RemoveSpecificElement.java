import java.util.Scanner;
import java.util.Stack;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<size;i++){
            int element = s.nextInt();
            stack.push(element);
        }
        System.out.println("Original Stack :"+stack);
        int c = s.nextInt();
        for(int i=0;i<size;i++){
            int n = stack.get(i);//System.out.println(n);
            if(n==c){
                stack.remove(i);
                break;
            }
        }
        System.out.println("After Remove Element Stack :"+stack);

    }
}
