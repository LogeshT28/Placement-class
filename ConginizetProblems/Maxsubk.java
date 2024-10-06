import java.util.*;
public class Maxsubk {

    public static void maxsubarryK(int[] arr,int k){
        int sum=0;
        int max=0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
      
        max = sum;
        int j=0;
        for(int i=k;i<arr.length;i++){
            sum = sum + arr[i];
            sum = sum - arr[j];
            j++;
            if(sum > max){
                max = sum;
            }
        }
        // for (int i = k; i < arr.length; i++) {
        //     sum = sum + arr[i] - arr[j++];
        //     if (sum > max) {
        //         max = sum;
        //     }
        // }

        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        // int max=0;
        // for(int j=0;j<size;j++){
        // int sum=0;
        // for(int i=j;i<k;i++){
        //     sum+=arr[i];
        // }
        // k++;
        // if(sum >= max)
        // {
        //     max=sum;
        // }
        // if(k > size){
        //     break;
        // }
        
    //}

    maxsubarryK(arr,k);
    //System.out.print(max);
    }
}
