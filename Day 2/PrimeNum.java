import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i=2;
        boolean res =false;
        while (i<num){
            if(num%i == 0){
                res = true;
                System.out.println(" Not Prime Number ");
                break;
            }
            i++;
        }
        if(!res){
            System.out.println("Prime Number ");
        }
    }
}
