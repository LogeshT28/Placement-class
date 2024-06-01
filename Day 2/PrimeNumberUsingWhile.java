import java.util.Scanner;
public class PrimeNumberUsingWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i=2;
        while (num!=0) {
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
                System.out.println(i);
                num--;
            }
            i++;
        }
    }
}
