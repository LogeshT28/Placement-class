import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=  s.nextInt();
        int arr[] = new int[size];
        int k = s.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+" ");
        // }
        
        // for(int i=size-1;i>=0;i--){
        //         System.out.print(arr[i]+" ");
        // }

        // for(int i: arr){
        //     System.out.println(i+" ");
        // }
        for (int i = 0; i < k; i++) {
            int temp = arr[size - 1];
            for (int j = size - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        // Print the rotated array
        System.out.println("Array after rotation:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        

   }

}
