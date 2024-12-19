import java.util.Scanner;

public class Alphabet_changing_pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            int temp = 63;
            for(int j=1;j<i;j++){
                char ch = (char) ((char) temp+i);
                System.out.print(ch+" ");
                temp +=1;
            }
            System.out.println();
        }
    }
}
