import java.util.Scanner;

public class CheckLastString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1=s.nextLine();
        String s2 = s.nextLine();
        String res1 = s1.substring(s1.length()-2);
        String res2 = s2.substring(s2.length()-2);
        if(res1.equals(res2)){
            System.out.println("Both Strings Are Equal");
        }
        else{
            System.out.println("Both Strings Are Not Equal");
 
        }

    }
}
