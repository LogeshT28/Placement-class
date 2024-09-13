import java.util.Scanner;

public class MoveZerosLeftInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        // int j=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=1){
        //         arr[j++]=arr[i];
        //     }
        // }
        // while(j<n){
        //     arr[j++]=1;
        // }
       

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // Inner loop starts from i + 1
                if (arr[i] == 0) {
                    i++;  // Increment i and break out of this iteration if arr[i] is 0
                    continue;
                }
                if (arr[j] == 1) {
                    j--;  // If arr[j] is 1, decrement j and continue
                    continue;
                }
                // Swap logic
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
