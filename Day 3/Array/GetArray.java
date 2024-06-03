import java.util.Scanner;
public class GetArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        } 
        System.out.println();

        for(int k=n-1;k>=0;k--){
            System.out.print(arr[k]+" ");
        }

    }

}
