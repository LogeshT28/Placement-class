import java.util.Scanner;

public class Cooradination {
    public static void main(String[] args) {
        Scanner  s=  new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if(x > 0 && y > 0){
            System.out.println("A");
        }
        else if(x > 0  && y <0){
            System.out.println("B");
        }
        else if(x < 0  && y <0){
            System.out.println("C");
        }
        else if(x < 0  && y > 0){
            System.out.println("D");
        }
    }
}
