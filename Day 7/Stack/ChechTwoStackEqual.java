import java.util.Scanner;
import java.util.Stack;

public class ChechTwoStackEqual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for(int i=0;i<size;i++){
            int element = s.nextInt();
            stack1.push(element);
        }
        for(int i=0;i<size;i++){
            int element = s.nextInt();
            stack2.push(element);
        }
        
int count=0;
        for(int i=0;i<size;i++){
            int n = stack1.get(i);
            int n1= stack2.get(i);
            if(n==n1){
                count++;
            }
        }
        if(count >=size){
            System.out.println("The Both Stacks Are Equal");
        }
        else{
            System.out.println("The Both Stacks Are Not Equal");
           
        }
    }
}
