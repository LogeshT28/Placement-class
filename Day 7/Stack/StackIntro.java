import java.util.Stack;
public class StackIntro {
    public static void main(String[] args) {
       Stack<String> animals = new Stack<>();
       animals.push("Dog");
       animals.push("Cat");
       animals.push("Tiger");
       System.out.println("Stack before poping: "+animals);
       animals.pop();
       System.out.println("Stack after poping :"+animals);
       
    }
}
