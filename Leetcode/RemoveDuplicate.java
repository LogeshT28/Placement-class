
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=  s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        // int temp[] = new int[n];
        // int j=0;
        // for(int i=0;i<n-1;i++){
        //     if(arr[i]!=arr[i+1]){
        //         temp[j++]=arr[i];
        //     }
        // }
        // temp[j++] = arr[arr.length-1];
        // int[] result = new int[j];
        // for (int i = 0; i < j; i++) {
        //     result[i] = temp[i];
        //     System.out.print(result[i]+" ");
        // }

        HashSet<Integer> st = new HashSet<>(); 
      for(int j:arr){
        st.add(j);
      }
      int res[] = new int[st.size()];
      int i=0;
      int k = st.size();
      for(int num:st){
        res[i++] = num;
      }
      for(int r: res){
        System.out.print(r+" ");
      }

    }
}


