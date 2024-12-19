import java.util.Scanner;

public class Reverse_right_half_pyramid {
     public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){

            for(int j=n-1;j>=i;j--){
                System.out.print("*"+" "); 
            }
            System.out.println();
        }
    }
}
