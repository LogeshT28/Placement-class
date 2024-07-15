 package Practice.arrayproblems;
import java.util.Scanner;
public class ArrayRotation {

    // public static int[] arrayReverse(int arr[], int size) {
    //     int[] reversedArray = new int[size];
    //     for (int i = size - 1, j = 0; i >= 0; i--, j++) {
    //         reversedArray[j] = arr[i];
    //     }
    //     return reversedArray;
    // }
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=  s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int k = s.nextInt();

        // int z[] = arrayReverse(arr, size);

        // for (int i = 0; i < size; i++) {
        //     System.out.print(z[i] + " ");
        // }
        
        // for(int i=size-1;i>=0;i--){
        //         System.out.print(arr[i]+" ");
        // }


        for(int i: arr){
            System.out.print(i+" ");
        }
        for (int i = 0; i < k; i++) {
            int temp = arr[size - 1];
            for (int j = size - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        //Print the rotated array
        System.out.println("Array after rotation:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        

   }

}


