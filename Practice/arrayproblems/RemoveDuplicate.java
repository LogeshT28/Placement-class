package Practice.arrayproblems;

import java.util.Scanner;
    
public class RemoveDuplicate {

    public static void removeduplicate(int[] a, int size) {
        int temp[] = new int[size];
        int j=0;
        for(int i=0;i<size-1;i++){
            if(a[i]!=a[i+1]){
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[size-1];
        // for(int num:temp){
        //     System.out.print(num+" ");
        // }
        
        for(int i=0;i<j;i++){
        System.out.print(temp[i]+" ");
    }
    } 
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size =s.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
         removeduplicate(arr,size);
    }

    
}
