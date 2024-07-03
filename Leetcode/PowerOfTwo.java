import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n%2==0){ 
            n/=2;
        }
        if(n==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
