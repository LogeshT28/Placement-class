package Practice.arrayproblems;

import java.util.Scanner;

public class ArraySortAndRotate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size=  s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<size-1;i++){
            if(arr[i] > arr[i+1]){
                count++;
            }
        }
        if(arr[0]< arr[size-1]){
            count++;
        }
        System.out.println(count);
        if(count <=1){
            System.out.println("Array is  Sorted But not Rotated");
        }
        else{
            System.out.println("Array is Not  Sorted but Rotated");
        }
    }
}
