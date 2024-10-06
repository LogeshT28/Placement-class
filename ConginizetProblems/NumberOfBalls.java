import java.util.Scanner;

public class NumberOfBalls {
    public static void main(String[] args) {
        Scanner s=  new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int count=0;
        int temp=0;
        for(int i=0;i<n;i++){
            temp=(int) Math.pow((i+1),2);
            count +=temp-arr[i];
        }

        System.out.println(count);
    }
}
