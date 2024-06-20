package Practice.arrayproblems;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=  s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp =arr[i];
                    arr[i] = arr[j];            
                    arr[j] = temp;
                }
            }
        }
       // System.out.println(arr.toString());
       for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }


    }

}
