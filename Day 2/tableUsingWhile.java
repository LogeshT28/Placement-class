import java.util.Scanner;
public class tableUsingWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a  = s.nextInt();
        int b=  s.nextInt();
        int i=1;
        while (i<=b) {
            System.out.println(i+"*"+a+"="+(i*a));
            i++;
        }
        i=b;
        while (i>0) {
            System.out.println(i+"*"+a+"="+(i*a));
            i--;
        }

    }
}
