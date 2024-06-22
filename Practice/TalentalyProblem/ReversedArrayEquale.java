package Practice.TalentalyProblem;
import java.util.Scanner;
public class ReversedArrayEquale {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the First Array elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("Enter the Second Array elements:");

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = s.nextInt();
        }
        int reversed[] = new int[n];
        for(int i=0;i<n;i++){
            int rev = 0;
            int num = arr1[i];
            while(num!=0){
                int temp = num%10;
                rev = (rev*10)+temp;
                num/=10;
            }
            reversed[i] = rev;  
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(reversed[i]==arr2[j]){
                    count++;
                }
            }
        }
        if(count >=1){
            System.out.println(count+" Pair is Found");
        }
        else{
            System.out.println("No pair Found");
        }
    }
}
