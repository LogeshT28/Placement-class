import java.util.Scanner;
public class AlternativePrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i= 2;
        while (i<n){
            int j=2;
            boolean test = false;
            while (j<i) {
                if(i%j == 0){
                    test = true;
                    break;
                }
                j++;
            }
            if(!test){
                System.out.print(i+" ");
            } 
            i++;
        } 
    }
}
