package Practice;

import java.util.Scanner;

public class LeftSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum=0;
        int current = 0;
        //Left Sum Of The Array
        // for(int i=0;i<n;i++){
        //     current  = arr[i];
        //     arr[i]=sum;
        //     sum+=current;
        // }
//Right Sum of Array
        for(int i=n-1;i>=0;i--){
            current = arr[i];
            arr[i] = sum;
            sum+= current;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
