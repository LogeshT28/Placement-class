import java.util.Scanner;

public class MagicMirror {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        String temp = a+a;
        if(temp.contains(b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
