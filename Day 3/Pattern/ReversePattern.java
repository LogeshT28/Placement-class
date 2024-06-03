import java.util.Scanner;
public class ReversePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();       
         System.out.println("Enter Your Number Here !! :");


        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(i);
            }
        System.out.println();
    }   
    }
}
