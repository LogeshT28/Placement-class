import java.util.Scanner;

class MaximumSumOfArrayRotation{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }




        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            int sum=0;
            
        for(int j=0;j<n;j++){
            sum +=j*arr[j];
        }

        if(sum > max){
            max=sum;
        }
        int temp = arr[0];
        for(int j=0;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        arr[n-1] = temp;
        
    }
    System.out.println("Maximum sum of among all rotation "+ max);
 }
}