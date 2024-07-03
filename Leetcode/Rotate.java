
import java.util.Scanner;

public class Rotate {
    public static void reverse(int a[],int s,int e){
        while(s<e){
            int temp =a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int k=s.nextInt();
        k%=n;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);

        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
