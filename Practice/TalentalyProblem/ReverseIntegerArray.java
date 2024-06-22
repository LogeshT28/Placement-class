package Practice.TalentalyProblem;

import java.util.Scanner;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int reversed[] = new int[n];
        for(int i=0;i<n;i++){
            int rev = 0;
            int num = arr[i];
            while(num!=0){
                int temp = num%10;
                rev = (rev*10)+temp;
                num/=10;
            }
            reversed[i] = rev;  
        }
        for(int t:reversed){
            System.out.print(t+" ");
        }
    }
}
